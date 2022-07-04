package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.baseclass;

public class search extends baseclass {
	
	
	@Test (description  = "lanch google url")
	public void Lanchurl() throws InterruptedException {
		
    driver.get("https://www.google.com/");
    Thread.sleep(4000);
    //driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
    
  

}
    @Test(description = "verify google lable")
    public void verifygooglelable() {
    
    String title =	driver.getTitle();
    System.out.println("the title of the page"  +title);
    assertequal(title,"google");
    
	}
    
	
	@Test(description  ="Enter the text in the searchbox")
     public void Entertextinsearchbox() throws InterruptedException {
    WebElement ele= driver.findElement(By.name("q"));
    ele.sendKeys("test automation");
    ele.click();
    Thread.sleep(4000);
      }
    
    
     
	private void assertequal(String title, String string) {
		// TODO Auto-generated method stub
		
		
	}
		
     
     
     
     
     
		
	}
