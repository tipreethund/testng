package paralleltestexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {

	@Test
	public void getedge() {
		System.setProperty("webdriver.msedge.driver",
				"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		System.out.println("Getting edge method which is running on thread:" + Thread.currentThread().getId());
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void getchrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srava\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Getting chrome method which is running on thread:" + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
	}

}
