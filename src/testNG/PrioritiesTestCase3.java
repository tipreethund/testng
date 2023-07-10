package testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PrioritiesTestCase3 {
	@Test(priority=4)
	public void s_Test() {
		System.out.println("3rd method");
	}

	@Test
	public void g_Test() {
		System.out.println("1st method");
	}

	@Test(priority=0)
	public void j_Test() {
		System.out.println("2nd method");
	}
	@Test
	public void q_test22() {
		System.out.println("6th method");
		Assert.fail();
	}
	@Test(priority=1)
	public void z_Test() {
		System.out.println("4th method");
		Assert.assertTrue(true);
	}
	@Test(enabled=true)
	public void  z_TestNg52() {
		System.out.println("5th method");
	}

	@Test(enabled = false) // To skip the annotation we can write like this
	public void a_Test() {
		System.out.println("first method");
	}

	@Test
	public void b_Test() { // In this way also we can skip the annotation & it will print msg in the console
		throw new SkipException("By this way also skip this annotation");
	}
}
