package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("praween");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praween@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9905511111");
		
		driver.findElement(By.xpath("//input[@class='green']")).click();
		
		driver.close();
	}

}
