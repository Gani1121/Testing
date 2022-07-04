package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.baseclass;
import utilities.configreader;

public class Launchgurusite{



public class LaunchGurusite extends baseclass{

configreader config;

@Test(priority=1)

public void LaunchURL() throws IOException  {
	

config   = new configreader();
driver.get(config.getapplicationURL());
String Titleofpage  = driver.getTitle();
System.out.println("title of page webpage is" + Titleofpage);

}


@Test(priority=2)
public void verifylable() {
WebElement lable= driver.findElement(By.xpath("/html/body/div[2]/h2"));
String labletext =lable.getText();
System.out.println("The lable displayed is" +labletext);

}
@Test(priority=3)
public void verifyuseridlable() {
	WebElement useridlable =driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[1]"));
	String uesridlable = useridlable.getText();
	System.out.println("the userislable displayed as"+uesridlable);
	
}
	@Test(priority=4)
	public void verifypasswordlabel() {
	WebElement passwordlabel= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]"));
	String verifypasswordlabel =passwordlabel.getText();
	System.out.println("the password label displayed as"+verifypasswordlabel);
	
	}
		@Test(priority=5)
		public void LogintoGurusite() throws InterruptedException {

		driver.findElement(By.name("uid")).sendKeys(config.getUserId());

		driver.findElement(By.name("password")).sendKeys(config.getpassword());

		driver.findElement(By.name("btnLogin")).click();

		Thread.sleep(4000);

		
		}
		
}
}








