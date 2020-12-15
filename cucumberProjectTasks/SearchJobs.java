package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchJobs {
	 WebDriver driver;
		
	    WebDriverWait wait;
		   @Given("^User is on Jobs Page$")
		
	    public void userIsOnJobsPage()  {
		
	        //Create a new instance of the Firefox driver
		
	        driver = new FirefoxDriver();
		
	        wait = new WebDriverWait(driver, 15);
		//Open the site
		
	        driver.get("https://alchemy.hguy.co/jobs/");
	        driver.findElement(By.linkText("Jobs")).click();
	        
		
	    }
		
	    
		
	    @When("^Find the suitable job$")
		
	    public void completeDetails() {
	
	    	driver.findElement(By.name("search_keywords")).sendKeys("SDET");
	    	driver.findElement(By.id("job_type_internship")).click();
	    	driver.findElement(By.id("job_type_freelance")).click();
	    	driver.findElement(By.id("job_type_part-time")).click();
	    	driver.findElement(By.id("job_type_temporary")).click();
	    	
	    	driver.findElement(By.xpath("//div[@class='search_submit']"));
	    	
	    	
	    	
	    	
	    	
	    }
	  @Then("^Apply for the job$")
		
	    public void applyForJob() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	WebElement joblisting = driver.findElement(By.xpath("//li[contains(@style, 'visibility: visible;')]/a/div"));
	    
	    		
	    		System.out.println(joblisting.getText());
	    		joblisting.click();
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    		driver.findElement(By.xpath("//a[@rel='next']")).click();
	    		driver.findElement(By.xpath("//input[@type='button']")).click();
   
		
	    }
	   @And("^close the browser$")
		
	    public void closeTheBrowser() {
		
	        driver.close();
		
	    }


}
