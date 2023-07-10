package groups;

import org.testng.annotations.Test;

public class ExceptionsTestNg {
	
	@Test(expectedExceptions=NullPointerException.class)
	public void exceptiontesting() {
		System.out.println("Exception handled");
		String n=null;
		System.out.println(n.length());
	}
}
