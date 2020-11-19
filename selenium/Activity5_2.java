package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		if (driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()) {
			
			System.out.println("checkbox is selected");
			}
		
		else {
			System.out.println("checkbox is not selected");
		}
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
if (driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()) {
			
			System.out.println("checkbox is selected");
			}
		
		else {
			System.out.println("checkbox is not selected");
		}
		
		driver.close();
	}

	}


