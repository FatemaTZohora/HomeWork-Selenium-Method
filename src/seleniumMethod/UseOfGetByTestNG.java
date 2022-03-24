package seleniumMethod;

import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfGetByTestNG {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatem\\eclipse-workspace\\SeliniumMethod\\driver_all\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // or.fullscreen();
		driver.manage().deleteAllCookies();

	}

	@Test
	public void urlTest() {
		driver.get("https://www.inova.org");
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
