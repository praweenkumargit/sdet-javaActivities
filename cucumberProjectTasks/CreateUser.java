package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CreateUser {
	 WebDriver driver;
		
	    WebDriverWait wait;
		   @Given("^User is on Users Page$")
		
	    public void userIsOnUsersPage() throws Throwable {
		
	        //Create a new instance of the Firefox driver
		
	        driver = new FirefoxDriver();
		
	        wait = new WebDriverWait(driver, 15);
		//Open the site
		
	        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	        driver.findElement(By.className("input")).sendKeys("root");
	        driver.findElement(By.xpath("//div/input[@id='user_pass']")).sendKeys("​pa\\$\\$w0rd");
	        driver.findElement(By.xpath("//p/input[@id='wp-submit']")).click();
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//div[@class='wp-menu-name']")).click();
	        driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
	        
	        
		
	    }
		
	    
		
	    @When("^Complete the details and submit$")
		
	    public void completeDetails() {
		
	    	driver.findElement(By.xpath("//td/input[@id='user_login']")).sendKeys("praween");
	    	driver.findElement(By.xpath("//td/input[@id='email']")).sendKeys("praween@gmail.com");
	    	
	    	driver.findElement(By.xpath("//p/input[@id='createusersub']")).click();
	    	
	    	
	    }
	  @Then("^Verify User created$")
		
	    public void verifyUserCreated() {
	    	driver.findElement(By.xpath("//p/input[@id='user-search-input']")).sendKeys("praween");
	    	driver.findElement(By.xpath("//p/input[@id='search-submit']")).click();
	    	
	    	
		WebElement items = driver.findElement(By.xpath("//span[@class='displaying-num"));
		System.out.println(items.isDisplayed());
      
		
	    }
	   @And("^Close the browser$")
		
	    public void closeTheBrowser() {
		
	        driver.close();
		
	    }


}
