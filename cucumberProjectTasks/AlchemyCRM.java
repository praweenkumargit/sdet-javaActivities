package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AlchemyCRM {
	 WebDriver driver;
		
	    WebDriverWait wait;
		   @Given("^I am on homepage$")
		
	    public void userIsOnHomePage() throws Throwable {
		
	        //Create a new instance of the Firefox driver
		
	        driver = new FirefoxDriver();
		
	        wait = new WebDriverWait(driver, 15);
		//Open the site
		
	        driver.get("https://alchemy.hguy.co/crm/");
	        driver.findElement(By.xpath("//div/input[@id='user_name']")).sendKeys("admin");
	        driver.findElement(By.xpath("//div/input[@id='username_password']")).sendKeys("pa$$w0rd");
	        driver.findElement(By.id("bigbutton")).click();
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	       
	    }
		   @When("^count dashlets$")
			
		    public void countDashlets() {
			   
			List <WebElement> dashlets = driver.findElements(By.xpath("//tbody/tr/td[@class='dashlet-title']"));
			System.out.println(dashlets.size());
			
			    }
		   
		   @When("^Provide the kumar3 in create Leads$")
			
		    public void createnewLeads() {
			   
			   WebElement home = driver.findElement(By.xpath("//a[@id='grouptab_0']"));	
				  
				  wait.until(ExpectedConditions.visibilityOf(home));
				  WebElement Leads = driver.findElement(By.xpath("//li/a[@id='moduleTab_9_Leads']"));
				  Actions action = new Actions(driver);
				  action.moveToElement(home).click().build().perform();
				  
				  
				  wait.until(ExpectedConditions.visibilityOf(Leads));
				  
				  action.moveToElement(Leads).click().build().perform();
				  driver.findElement(By.xpath("//li/a[@data-action-name='Create']")).click();
				  WebElement create = driver.findElement(By.xpath("//div/h2[@class='module-title-text']"));
				  wait.until(ExpectedConditions.visibilityOf(create));
				  System.out.println("hi");
				  //if (driver.findElement(By.xpath("//div/a[class='collapsed']")).isDisplayed()) {
				//	  driver.findElement(By.xpath("//div/a[class='collapsed']")).click(); 
				  //}
				  
				  WebElement lead = driver.findElement(By.xpath("//div/input[@id='last_name']"));
				  wait.until(ExpectedConditions.elementToBeClickable(lead));
				
				  lead.sendKeys("kumar3");
				  
				  System.out.println("hi");
				  
			    }
		   
		   @When("^Provide the \"(.*)\" in create Meetings$")
			
		    public void createMeetings(String name) {
			   
			   WebElement activities = driver.findElement(By.xpath("//a[@id='grouptab_3']"));	
				  
				  wait.until(ExpectedConditions.visibilityOf(activities));
				  activities.click();
				  WebElement meeting = driver.findElement(By.xpath("//li/a[@id='moduleTab_9_Meetings']"));
				  wait.until(ExpectedConditions.visibilityOf(meeting));
				  meeting.click();
				  //Actions action = new Actions(driver);
				  //action.moveToElement(meeting).click().build().perform();
				  
				  driver.findElement(By.xpath("//li/a[@data-action-name='Schedule_Meeting']")).click();
				  WebElement create = driver.findElement(By.xpath("//div/h2[@class='module-title-text']"));
				  wait.until(ExpectedConditions.visibilityOf(create));
				  
				
				  WebElement meet = driver.findElement(By.xpath("//div[@field='name']/input"));
				  wait.until(ExpectedConditions.elementToBeClickable(meet));
				  driver.findElement(By.xpath("//div[@field='name']/input")).sendKeys(name);
				  
				  WebElement save = driver.findElement(By.xpath("//div/input[@id='SAVE_HEADER']"));
				  wait.until(ExpectedConditions.elementToBeClickable(save));
				  
				  driver.findElement(By.xpath("//div/input[@id='SAVE_HEADER']")).click();;
				  
			    }
		   @When("^Provide \"(.*)\" and \"(.*)\" in products$")
			
		    public void createproducts(String name, String price) {
			  JavascriptExecutor je = (JavascriptExecutor) driver;
			   
			   System.out.println("hi");
			   WebElement all = driver.findElement(By.xpath("//a[@id='grouptab_5']"));
				  
				  wait.until(ExpectedConditions.visibilityOf(all));
				  Actions action = new Actions(driver);
				  action.moveToElement(all).click().build().perform();
				  
				  WebElement products = driver.findElement(By.linkText("Products"));
				 wait.until(ExpectedConditions.elementToBeClickable(products));
				  je.executeScript("arguments[0].scrollIntoView(true);",products);
				  products.click();
				  
				 // action.moveToElement(products).click().build().perform();
				  System.out.println("bye");
				  driver.findElement(By.xpath("//li/a[@data-action-name='Create']")).click();
				 // WebElement createP = driver.findElement(By.xpath("//div/h2[@class='module-title-text']"));
				 // wait.until(ExpectedConditions.visibilityOf(createP));
				  System.out.println("bye");
				
				  WebElement createProductName = driver.findElement(By.xpath("//div[@field='name']/input"));
				  wait.until(ExpectedConditions.elementToBeClickable(createProductName));
				  createProductName.sendKeys(name);
				  
				  WebElement createProductPrice = driver.findElement(By.xpath("//div[@field='price']/input"));
				  wait.until(ExpectedConditions.elementToBeClickable(createProductPrice));
				  createProductName.sendKeys(price);
				  
				  driver.findElement(By.xpath("//div/input[@id='SAVE']")).click();;
			    }
		   
		   @Then("^print count and title of dashlets$")
			
		    public void print() {
			   List <WebElement> dashletTitle =  driver.findElements(By.xpath("//td[@class='dashlet-title']/h3/span"));
				
			   for (WebElement x : dashletTitle) {
				System.out.println(x.getText());
			   }
				driver.close();
		   }
		   
		   @Then("^verify new Lead$")
			
		    public void verifyNewLead() {
			   driver.findElement(By.xpath("//li/a[@data-action-name='List']")).click();
				driver.close();
		   }
		   
		   @Then("^verify creation of \"(.*)\" meetings$")
			
		    public void verifyNewMeeting(String name) {
			   driver.findElement(By.xpath("//li/a[@data-action-name='List']")).click();
			   
			  List <WebElement> name2 = driver.findElements(By.xpath("//tr/td[@type='name']"));
			  for (WebElement naam: name2) {
				 
				  System.out.println(naam.getText());
				  //Assert.assertTrue(naam.getText().contains(name));
				  
			  }
				driver.close();
		   }
		   
		   @Then("^verify creation of products$")
			
		    public void verifyNewProduct() {
			   driver.findElement(By.xpath("//li/a[@data-action-name='List']")).click();
				driver.close();
		   }
}
