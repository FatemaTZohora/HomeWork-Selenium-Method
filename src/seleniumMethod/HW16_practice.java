package seleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW16_practice {
	
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
//boolean elementPresent = driver.findElement(By.xpath("xpath")).isDisplayed();
		// here I've used cssSelector by class, cssselector="htmlTag.value of class"
		// here the class name has space and its called  compound class but compound class is not permitted "btn btn-sm btn-primary"
		// thats why we have to remove the space with dot(.)  --> "a.btn.btn-sm.btn-primary"
		@Test(enabled = true , priority=1)
		public void logIntoMyCignaButtonTest() throws InterruptedException {
			boolean elementDisplayed = driver.findElement(By.cssSelector("a.btn.btn-sm.btn-primary")).isDisplayed(); 
			System.out.println("Is the logIntoMyCignaButton displayed? Ans: " + elementDisplayed);                                                             
			Thread.sleep(3000);

		}


		//boolean elementEnabled = driver.findElement(By.xpath("xpath")).isEnabled(); 
			@Test(enabled = false , priority=4)
			public void searchButtonTest() throws InterruptedException {
				boolean searchButtonEnable = driver.findElement(By.cssSelector("button.btn.btn-sm")).isEnabled();
				System.out.println("Is the searchButtonEnabled ? ans: " + searchButtonEnable);
				Thread.sleep(3000);

			}
			@Test(enabled = false , priority=2)
			public void emailCheckBoxTest() throws InterruptedException {
				boolean emailCheckBoxSelected = driver.findElement(By.name("No_Email_Address")).isSelected();  //source: https://secure.cigna.com/form/kana/id_request/?344
				System.out.println("Is the emailCheckBoxSelected ? ans: " + emailCheckBoxSelected);
				Thread.sleep(3000);

			}
		@AfterTest
		public void tearUp() {
			driver.quit();
		}
	}



