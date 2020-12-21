package stepDefinitions;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class OrangeHRM {
	 WebDriver driver;
		
	    WebDriverWait wait;
		   @Given("^User is on Recruitment page$")
		
	    public void userIsOnPage() throws Throwable {
		
	        //Create a new instance of the Firefox driver
		
	        driver = new FirefoxDriver();
		
	        wait = new WebDriverWait(driver, 15);
		//Open the site
		
	        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	        driver.findElement(By.xpath("//div/input[@id='txtUsername']")).sendKeys("orange");
	        driver.findElement(By.xpath("//div/input[@id='txtPassword']")).sendKeys("orangepassword123");
	        driver.findElement(By.xpath("//div/input[@id='btnLogin']")).click();
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	        driver.findElement(By.linkText("Recruitment")).click();
	        driver.findElement(By.linkText("Vacancies")).click();
	        driver.findElement(By.xpath("//div/input[@id='btnAdd']")).click();
	      
	    }
		   @Given("^I am on Candidates page$")
			
		    public void userIsOnCandidatePage() throws Throwable {
			
		        //Create a new instance of the Firefox driver
			
		        driver = new FirefoxDriver();
			
		        wait = new WebDriverWait(driver, 15);
			//Open the site
			
		        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
		        driver.findElement(By.xpath("//div/input[@id='txtUsername']")).sendKeys("orange");
		        driver.findElement(By.xpath("//div/input[@id='txtPassword']")).sendKeys("orangepassword123");
		        driver.findElement(By.xpath("//div/input[@id='btnLogin']")).click();
		        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		        driver.findElement(By.linkText("Recruitment")).click();
		        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		        driver.findElement(By.linkText("Candidates")).click();
		        driver.findElement(By.xpath("//div/input[@id='btnAdd']")).click();
		      
		    }
		   
		   @Given("^I am on Employees page$")
			
		    public void userIsOnEmployeePage() throws Throwable {
			
		        //Create a new instance of the Firefox driver
			
		        driver = new FirefoxDriver();
			
		        wait = new WebDriverWait(driver, 15);
			//Open the site
			
		        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
		        driver.findElement(By.xpath("//div/input[@id='txtUsername']")).sendKeys("orange");
		        driver.findElement(By.xpath("//div/input[@id='txtPassword']")).sendKeys("orangepassword123");
		        driver.findElement(By.xpath("//div/input[@id='btnLogin']")).click();
		        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		        driver.findElement(By.linkText("PIM")).click();
		        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		        driver.findElement(By.linkText("Employee List")).click();
		        driver.findElement(By.xpath("//div/input[@id='btnAdd']")).click();
		      
		    }
	
		   @When("^Filled necessary details$")
			
		    public void filledDetails() {
			   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			   System.out.println("hi");
			WebElement jobTitle = driver.findElement(By.id("addJobVacancy_jobTitle"));
			
			Select jobTitleElements = new Select(jobTitle);
			 System.out.println("hi");
			jobTitleElements.selectByValue("1");
			driver.findElement(By.xpath("//input[@id='addJobVacancy_name']")).sendKeys("Master10");
			driver.findElement(By.xpath("//input[@id='addJobVacancy_hiringManager']")).sendKeys("IBM 01");
			
			        
			driver.findElement(By.xpath("//p/input[@id='btnSave']")).click();
			    }
		   
		   @When("^provide \"(.*)\" and \"(.*)\" and \"(.*)\" in details$")
			
		    public void filleVacancyDetails(String jobTitle, String vacancyName, String hiringManager) {
			
			   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			   System.out.println("hi");
			WebElement jobTitle2 = driver.findElement(By.id("addJobVacancy_jobTitle"));
			
			Select jobTitleElements = new Select(jobTitle2);
			
			jobTitleElements.selectByValue(jobTitle);
			driver.findElement(By.xpath("//input[@id='addJobVacancy_name']")).sendKeys(vacancyName);
			driver.findElement(By.xpath("//input[@id='addJobVacancy_hiringManager']")).sendKeys(hiringManager);
			
			        
			driver.findElement(By.xpath("//p/input[@id='btnSave']")).click();
		    }
		   
		   @When("^I provide \"(.*)\" and \"(.*)\" and \"(.*)\" in details$")
			
		    public void filledEmployeeDetails(String name, String name2, String name3) {
			
		     driver.findElement(By.name("firstName")).sendKeys(name);
		     driver.findElement(By.name("lastName")).sendKeys(name2);
		     driver.findElement(By.name("chkLogin")).click();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.findElement(By.name("user_name")).sendKeys(name3);
		     driver.findElement(By.xpath("//p/input[@id='btnSave']")).click();
		    }
		    
		   @When("^Fill details$")
			
		    public void fillCandidateDetails() {
			   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@id='addCandidate_firstName']")).sendKeys("Master10");
			driver.findElement(By.xpath("//input[@id='addCandidate_lastName']")).sendKeys("IBM 01");
			driver.findElement(By.xpath("//input[@id='addCandidate_email']")).sendKeys("master10@gmail.com");
			        
			WebElement uploadBtn = driver.findElement(By.id("addCandidate_resume"));
			File file = new File("src/test/resources/myResume.docx");
			uploadBtn.sendKeys(file.getAbsolutePath());
			
			driver.findElement(By.xpath("//p/input[@id='btnSave']")).click();
			
			    }
	
		
		@Then("^validate the vacancy creation$")
			
		    public void verifyVacancyCreated() {
			WebElement attachment = driver.findElement(By.xpath("//input[@id='btnAddAttachment']"));
			
			Assert.assertTrue(attachment.isDisplayed());
    	 driver.close();
    	}
	
		
		@Then("^validate new candidate$")
		
	    public void verifyCandidateDetailsCreated() {
			driver.findElement(By.linkText("Recruitment")).click();
			driver.findElement(By.xpath("//input[@id='candidateSearch_candidateName']")).sendKeys("Master10");
			WebElement hint = driver.findElement(By.xpath("//div[@class='ac_results']"));
			
			Assert.assertTrue(hint.isDisplayed());
			driver.close();
			
	}	
		
@Then("^I verify creation$")
		
	    public void verifyEmployeeCreated() {
			
			WebElement attachment = driver.findElement(By.xpath("//input[@id='btnAddAttachment']"));
			
			Assert.assertTrue(attachment.isDisplayed());
			
			driver.close();
	}

@Then("verify creations$")

public void verifyCreated() {
	
	WebElement attachment = driver.findElement(By.xpath("//input[@id='btnAddAttachment']"));
	
	Assert.assertTrue(attachment.isDisplayed());
	
	driver.close();
}

}
