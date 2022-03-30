package hw_15_selenium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW15_Q2_test_url_by_class_locator {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatem\\eclipse-workspace\\SeleniumNewFatema\\driver_all\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.truist.com/");
	}

	@Test
	public void searchButtonTest() throws InterruptedException {
		driver.findElement(By.className("truist-globalnav-header-linktext")).click();
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}
}
