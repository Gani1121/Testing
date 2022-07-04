package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseclass {

	
	
	public WebDriver driver;
	
	@BeforeTest 
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
					
		
	}
	
	@AfterTest
	public void closebrowsersession()  {
	
    driver.quit();
	}
}