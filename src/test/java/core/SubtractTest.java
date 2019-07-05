package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SubtractTest {

	@Test
	public void subtract_test_instanceOf() {
		assertThat(Calculator.subtract(3, 2), instanceOf(Double.class));
	}

	@Test
	public void subtract_test_2_param() {
		assertThat(Calculator.subtract(3, 2), equalTo(1.0));
	}

	@Test
	public void subtract_test_3_param() {
		assertThat(Calculator.subtract(20, 3, 4), equalTo(13.0));
	}

	@Test
	public void subtract_test_4_param() {
		assertThat(Calculator.subtract(20, 3, 4, 5), equalTo(8.0));
	}
}
