package crm.project;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/crm");
		
		 WebElement userName = driver.findElement(By.id("user_name"));
	     WebElement password = driver.findElement(By.id("username_password"));
		
	     userName.sendKeys("admin");
	     password.sendKeys("pa$$w0rd");
	    
	     driver.findElement(By.cssSelector("#bigbutton")).click();
	    
	    String expectedTitle = "SuiteCRM";
	     if(driver.getTitle()!= null && driver.getTitle().contains(expectedTitle)){
	    	  System.out.println("Web page is opened");
	    	}
	    	else{
	    	  System.out.println("Web page could not open.");
	    	}
	    
	     driver.close();
	}
}
