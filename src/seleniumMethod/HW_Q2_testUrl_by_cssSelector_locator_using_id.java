package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.api.trace.Span;

public class HW_Q2_testUrl_by_cssSelector_locator_using_id {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", // webdriver must be written in lowerCase
				"C:\\Users\\fatem\\eclipse-workspace\\SeliniumMethod\\driver_all\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com//");

	}

	@Test(enabled = true, priority = 1)
	public void amazonLogoTest() throws InterruptedException {
		driver.findElement(By.cssSelector("a#nav-logo-sprites")).click();
		Thread.sleep(5000);
	}

	@Test(enabled = true, priority = 2)
	public void helloSelectYourAddressTest() throws InterruptedException {
		driver.findElement(By.cssSelector("span.nav-line-2.nav-progressive-content")).click();
		Thread.sleep(5000);
	}


	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
