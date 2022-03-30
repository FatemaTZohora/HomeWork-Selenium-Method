package hw_16_selenium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_Q1_test_url_using_getAttribute_method {
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
	public void attributeTest() {
		String value01 = driver
				.findElement(By.xpath("//a[@class='nav-link' and @id='health-care-providers-level-one-link']"))
				.getAttribute("id");
		String value02 = driver
				.findElement(By.xpath("//a[@class='nav-link' and @id='health-care-providers-level-one-link']"))
				.getAttribute("class");
		String value03 = driver
				.findElement(By.xpath("//a[@class='nav-link' and @id='health-care-providers-level-one-link']"))
				.getAttribute("href");
		String value04 = driver
				.findElement(By.xpath("//a[@class='nav-link' and @id='health-care-providers-level-one-link']"))
				.getAttribute("target");
		System.out.println("The value of the id attribute is: " + value01);
		System.out.println("The value of the class attribute is: " + value02);
		System.out.println("The value of the href attribute is: " + value03);
		System.out.println("The value of the target attribute is: " + value04);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
