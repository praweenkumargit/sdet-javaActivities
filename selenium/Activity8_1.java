package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity8_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@class='willDisappear']")));
		
		
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='willDisappear']")));
		
		driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
		
		driver.close();

	}

}
