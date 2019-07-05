package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DivideTest {

	@Test
	public void divide_test_instanceOf() {
		assertThat(Calculator.divide(3, 2), instanceOf(Double.class));
	}

	@Test
	public void divide_test_2_param() {
		assertThat(Calculator.divide(3, 2), closeTo(1.5, 0.09));
	}

	@Test
	public void divide_test_3_param() {
		assertThat(Calculator.divide(20, 5, 4), closeTo(1.0, 0.09));
	}

	@Test
	public void divide_test_4_param() {
		assertThat(Calculator.divide(300, 3, 5, 2), closeTo(10.0, 0.09));
	}
}
