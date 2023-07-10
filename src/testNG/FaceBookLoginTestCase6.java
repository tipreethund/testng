package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBookLoginTestCase6 {
	private WebDriver driver;

	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srava\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void enteringtext() {
		driver.findElement(By.id("email")).sendKeys("akdfjaernvaoewi");
		driver.findElement(By.id("pass")).sendKeys("uiqehrnfn");
		driver.findElement(By.name("login")).click();
		String expected = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
		String actual = driver.findElement(By.className("_9ay7")).getText();
		Assert.assertEquals(actual, expected);

	}

	@AfterTest
	public void terminateprogram() {
		driver.close();
	}

}
