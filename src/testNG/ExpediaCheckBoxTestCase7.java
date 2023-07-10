package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExpediaCheckBoxTestCase7 {
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srava\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void checkbox() {
		driver.findElement(By.xpath("//*[@id=\"add-flight-switch\"]")).click();
		boolean actual = driver.findElement(By.xpath("//*[@id=\"add-flight-switch\"]")).isSelected();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@AfterTest
	public void terminateprogram() {
		driver.close();
	}
}
