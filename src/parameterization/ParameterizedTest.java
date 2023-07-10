package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters("languages")
	public void parameterizedtest(String languages) {
		if (languages.equals("Java")) {
			System.out.println("open eclipse");
		} else if (languages.equals("SQL")) {
			System.out.println("open SQL server");
		}
	}
}
