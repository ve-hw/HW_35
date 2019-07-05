package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MiltiplyTest {

	@Test
	public void multiply_test_instanceOf() {
		assertThat(Calculator.multiply(2, 2), instanceOf(Double.class));
	}

	@Test
	public void multiply_test_2_param() {
		assertThat(Calculator.multiply(2, 3), equalTo(6.0));
	}

	@Test
	public void multiply_test_3_param() {
		assertThat(Calculator.multiply(2, 3, 4), equalTo(24.0));
	}

	@Test
	public void multiply_test_4_param() {
		assertThat(Calculator.multiply(2, 3, 4, 5), equalTo(120.0));
	}
}
