package seleniumMethod;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_useOfGetMethodByMainMethod {

	public static void main(String[] args) {
		// system is a class and setProperty is a method
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fatem\\eclipse-workspace\\SeliniumMethod\\driver_all\\chromedriver.exe");
        //webdriver is an interface and chromedriver is a concrete class which implements webdriver  interface
		WebDriver driver = new ChromeDriver(); // this line open the chrome browser.
		driver.manage().window().maximize(); // this line maximize the browser
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		driver.quit();
	}
}
