package hw_selenium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_Q1_test_url_using_getCurrentURL_method {
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
	public void textTest() throws InterruptedException {
		WebElement dup = driver.findElement(By.xpath("//a[text()='Dental Insurance Plans']"));
		Thread.sleep(5000);
		System.out.println("The text for the WebElement is: " + dup.getText());

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
