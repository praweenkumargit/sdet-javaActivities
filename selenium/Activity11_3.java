package selenium_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		
		Alert alert = driver.switchTo().alert();
       System.out.println(alert.getText());
       alert.sendKeys("Yes, you are!");
       alert.accept();
       
       driver.close();

	}

}
