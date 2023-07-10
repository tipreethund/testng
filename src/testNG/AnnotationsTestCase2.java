package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestCase2 {
	@BeforeClass
	void a() {
		System.out.println("E");		//Annotations Sequence will be like this only:
	}									//BeforeTest
	@AfterClass							//BeforeClass
	void b() {							//BeforeMethod
		System.out.println("G");		//Test
	}									//AfterMethod
	@Test								//AfterClass
	void c() {							//AfterTest
		System.out.println("T");
	}
	@BeforeTest
	void d() {
		System.out.println("T");
	}
	@AfterTest
	void e() {
		System.out.println("Annotations sequence");
	}
	@BeforeMethod
	void f() {
		System.out.println("S");
	}
	@AfterMethod
	void g() {
		System.out.println("N");
	}
}
