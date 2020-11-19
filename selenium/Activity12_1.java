package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println(driver.getTitle());
		
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		
		driver.switchTo().frame(frame1);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		
		System.out.println(driver.findElement(By.cssSelector("button")).getText());
		System.out.println(driver.findElement(By.cssSelector("button")).getCssValue("background-color"));
		
		driver.findElement(By.cssSelector("button")).click();
		System.out.println(driver.findElement(By.cssSelector("button")).getText());
		System.out.println(driver.findElement(By.cssSelector("button")).getCssValue("background-color"));
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
		
System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		
		System.out.println(driver.findElement(By.cssSelector("button")).getText());
		System.out.println(driver.findElement(By.cssSelector("button")).getCssValue("color"));
		
		driver.findElement(By.cssSelector("button")).click();
		System.out.println(driver.findElement(By.cssSelector("button")).getText());
		System.out.println(driver.findElement(By.cssSelector("button")).getCssValue("color"));
		
		driver.close();
		

	}

}
