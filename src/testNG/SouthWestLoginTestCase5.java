package testNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SouthWestLoginTestCase5 {
	public WebDriver driver = null;

	@BeforeMethod
	public void launchingBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srava\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		String baseurl = "https://www.southwest.com";
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void enterText() {

		driver.findElement(
				By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div[2]/div/div[1]/span/span/div/div[2]/button"))
				.click();
		driver.findElement(By.id("username")).sendKeys("sagde");
		driver.findElement(By.id("password")).sendKeys("van2");
		driver.findElement(By.id("login-form--submit-button")).click();
		String expected = "Maximum number of tries reached. Please try again later.";
		String actual = driver.findElement(By.className("form-control--errors")).getText();
		Assert.assertEquals(expected, actual);
	}

	@AfterTest
	public void terminateProgram() {
		driver.close();
	}
}
