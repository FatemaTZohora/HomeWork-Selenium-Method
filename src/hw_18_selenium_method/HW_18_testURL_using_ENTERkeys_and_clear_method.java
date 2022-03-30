package hw_18_selenium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_18_testURL_using_ENTERkeys_and_clear_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatem\\eclipse-workspace\\SeleniumNewFatema\\driver_all\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
	}

	@Test
	public void searchFieldTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("watch", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("jacket", Keys.RETURN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("cook pot", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("winter coat",
				Keys.RETURN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).clear();
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}