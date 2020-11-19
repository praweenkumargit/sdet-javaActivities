package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity5_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		if (driver.findElement(By.className("willDisappear")).isDisplayed()) {
			
			System.out.println("checkbox is there");
			}
		
		else {
			System.out.println("checkbox is gone");
		}
		
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		
if (driver.findElement(By.className("willDisappear")).isDisplayed()) {
			
			System.out.println("checkbox is there");
			}
		
		else {
			System.out.println("checkbox is gone");
		}
		
		driver.close();
	}

}
