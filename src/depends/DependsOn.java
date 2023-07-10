package depends;

import org.testng.annotations.Test;

public class DependsOn {

		@Test(dependsOnMethods= {"testcase2"})
		public void testcase1() {
			System.out.println("Test case1 executed");
		}
		@Test
		public void testcase2() {
			System.out.println("Test case2 executed");
		}
		@Test(priority=0)
		public void testcase3() {
			System.out.println("Test case3 executed");
		}
		@Test(priority=4)
		public void testcase4() {
			System.out.println("Test case4 executed");
		}
		@Test(priority=2)
		public void testcase5() {
			System.out.println("Testcase5 executed");
		}
}
