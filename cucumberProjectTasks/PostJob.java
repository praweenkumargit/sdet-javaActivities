package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostJob {
	 WebDriver driver;
		
	    WebDriverWait wait;
		   @Given("^User is on Post Jobs page$")
		
	    public void userIsOnPostJobsPage()  {
		
	        //Create a new instance of the Firefox driver
		
	        driver = new FirefoxDriver();
		
	        wait = new WebDriverWait(driver, 15);
		//Open the site
		
	        driver.get("https://alchemy.hguy.co/jobs/");
	        driver.findElement(By.linkText("Post a Job")).click();
	        
		
	    }
		
		   @And("^filled \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
			
		    public void filledDetails(String email, String job, String description, String url, String companyName) {
			
		     driver.findElement(By.name("create_account_email")).sendKeys("yyy@hjh.com");
		     driver.findElement(By.name("job_title")).sendKeys(job);
		     WebElement frame = driver.findElement(By.xpath("//iframe[@id='job_description_ifr']"));
		     driver.switchTo().frame(frame);
		     driver.findElement(By.id("tinymce")).sendKeys(description);
		     driver.switchTo().defaultContent();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		     driver.findElement(By.xpath("//input[@id='application']")).sendKeys("http://www.google.com");
		     driver.findElement(By.name("company_name")).sendKeys(companyName);
			
		    }
		   
	    
		
	    @When("^user has previewed and submitted$")
		
	    public void submit() {
	
	    	driver.findElement(By.xpath("//input[@name='submit_job']")).click();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("//input[@name='continue']")).click();
	    	
	    	
	    	
	    	
	    }
	  @Then("^validate job listing$")
		
	    public void validateListing() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("click here")).click();
	    	WebElement joblisting = driver.findElement(By.xpath("//div/h1"));
	    
	    		
	    		System.out.println(joblisting.getText());
	    		Assert.assertTrue(joblisting.isDisplayed());
		
	    }
	  

}
