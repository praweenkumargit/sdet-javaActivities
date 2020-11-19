package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("admin1");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password1");
		driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password1");
		driver.findElement(By.xpath("//input[contains(@class, 'email-')]")).sendKeys("pk@gmail.com");
		
		
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		
		WebElement confm = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
		
		
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(confm));
		
		 System.out.println(confm.getText());
		 
		 driver.close();
		

	}

}
