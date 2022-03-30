package hw_16_selenium_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_Q1_test_url_using_isSelected_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatem\\eclipse-workspace\\SeleniumNewFatema\\driver_all\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://secure.cigna.com/form/kana/id_request/?344");
	}

	@Test
	public void emailCheckBoxTest() throws InterruptedException {
		boolean emailCheckBoxSelected = driver.findElement(By.name("No_Email_Address")).isSelected();
		System.out.println("Is the emailCheckBoxSelected ? ans: " + emailCheckBoxSelected);
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
