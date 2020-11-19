package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity8_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/ajax");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(@class,  'violet')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
    	
        System.out.println(ajaxText);
		
		
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		
        String lateText = driver.findElement(By.id("ajax-content")).getText();
    	
        System.out.println(lateText);
        
        driver.close();
	
		

	}

}
