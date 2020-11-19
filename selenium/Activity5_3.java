package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		if (driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled()) {
			
			System.out.println("Textbox is enabled");
			}
		
		else {
			System.out.println("Textbox is not enabled");
		}
		
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		
	if (driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled()) {
			
			System.out.println("Textbox is enabled");
			}
		
		else {
			System.out.println("Textbox is not enabled");
		}
		
		driver.close();
	}


	}


