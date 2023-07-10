package depends;

import org.testng.annotations.Test;

public class DependsOnGroups {
	
	@Test(groups="Firstgroup")
	public void testcase1() {
		System.out.println("Testcase1 executed");
	}
	@Test(groups="Secondgroup")
	public void testcase2() {
		System.out.println("Testcase2 executed");
	}
}
