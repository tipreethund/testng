package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmericanAirlinesRadioButtonTestCase8 {
	public WebDriver driver;
	@BeforeTest
	public void launchingBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srava\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
	}
	@Test
	public void enableButton() {
		driver.findElement(By.xpath("//*[@id=\"bookingCheckboxContainer\"]/div[1]/div[2]/label/span[3]")).click();
		boolean actual=driver.findElement(By.id("flightSearchForm.tripType.oneWay")).isSelected();
		boolean expected=true;
		Assert.assertEquals(actual, expected);
	}
}
