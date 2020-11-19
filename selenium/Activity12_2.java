package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		System.out.println(driver.getTitle());

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));
		//WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		//WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}
;