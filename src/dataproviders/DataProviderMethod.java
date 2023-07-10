package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {

	@DataProvider(name = "TestCases")
	public Object[][] dpmethod() {
		return new Object[][] {{"First Parameter"},{"Second Parameter"}};
	}

	@Test(dataProvider = "TestCases")
	public void testcaseslist(String cases) {
		System.out.println("Passing parameters through dataproviders method:" + cases);
	}
}