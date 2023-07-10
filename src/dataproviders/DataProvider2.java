package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	@DataProvider(name = "blood_groups")
	public Object[][] blooddonations() {
		return new Object[][] { { "O +ve" }, { "O -ve" }, { "A +ve" }, { "B +ve" } };
	}

	@Test(dataProvider = "blood_groups")
	public void blooddonars(String donars) {
		System.out.println("Blood groups are:" + donars);
	}
}
