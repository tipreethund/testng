package groups;

import org.testng.annotations.Test;

public class TestCase2 {

	@Test(groups = { "smoke testing", "load testing" })
	public void mailsendingtest() {
		System.out.println("Mail sent successfully by smoke & load testing");
	}

	@Test(groups = "functional testing")
	public void msgsendingtest() {
		System.out.println("Message sent successfully by functional testing");
	}
}
