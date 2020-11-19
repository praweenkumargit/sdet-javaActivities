package crm.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	
	WebDriver driver;
  @Test
  public void f() {

	  driver.get("http://alchemy.hguy.co/crm");
	  
	  String title = driver.getTitle();
	  
	Assert.assertEquals(title, "SuiteCRM");
		 
	if (title.matches("SuiteCRM") ) { 
		driver.close();
		}
	 
	  
	  
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	   driver = new FirefoxDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	
  }

}
