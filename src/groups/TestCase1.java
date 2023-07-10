package groups;

import org.testng.annotations.Test;

public class TestCase1 {

	@Test(groups = { "smoke testing", "load testing" })
	public void selecttext1() {
		System.out.println("Text selected successfully by smoke testing,load testing");
	}

	@Test(groups = { "functional testing", "load testing" })
	public void replacetexttest2() {
		System.out.println("Replaced text successfully by functional testing");
	}

	@Test(groups = { "smoke testing", "functional testing" })
	public void logintest3() {
		System.out.println("Logged successfully by smoke & functional testing");
	}

	@Test(groups = "load testing")
	public void sendmailtest() {
		System.out.println("Mail sent successfully by load testing");
	}
}
