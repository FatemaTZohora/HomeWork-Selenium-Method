package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_use_of_get_method_firefoxDriver {
	
		FirefoxDriver driver;

		@BeforeTest
		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\fatem\\eclipse-workspace\\SeliniumMethod\\driver_all\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			driver.get("https://portaldev.cms.gov/portal/");
			Thread.sleep(4000);
		}
		@Test
		public void loginButtonTest() {
			driver.findElement(By.id("cms-login-submit")).click();
			
		}

		@AfterTest
		public void tearUp() {
			driver.quit();
		}

	}



