package hw_selenium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW15_Q2_test_url_by_partialLinkText_locator {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatem\\eclipse-workspace\\SeleniumNewFatema\\driver_all\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.inova.org/careers");
	}

	@Test
	public void currentTeammemberTest() throws InterruptedException {
		driver.findElement(By.partialLinkText("Current Team ")).click();
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}
}
