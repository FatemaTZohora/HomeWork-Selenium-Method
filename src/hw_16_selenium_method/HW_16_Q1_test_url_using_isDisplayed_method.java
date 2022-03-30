package hw_16_selenium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_Q1_test_url_using_isDisplayed_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatem\\eclipse-workspace\\SeleniumNewFatema\\driver_all\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cigna.com/");
	}

	@Test
	public void logIntoMyCignaButtonTest() throws InterruptedException {
		boolean elementDisplayed = driver.findElement(By.cssSelector("a.btn.btn-sm.btn-primary")).isDisplayed();
		System.out.println("Is the logIntoMyCignaButton displayed? Ans: " + elementDisplayed);
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
