package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		
		WebElement confm = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		
		
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(confm));
		
		 System.out.println(confm.getText());
		 
		 driver.close();
		
				
		
		
		
	}

}
