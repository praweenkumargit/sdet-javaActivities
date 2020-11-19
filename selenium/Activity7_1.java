package selenium_project;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement text = driver.findElement(By.id("single-value"));
	WebElement drop = driver.findElement(By.xpath("//select[@id='single-select']"));	
		Select select = new Select(drop);
		
		select.selectByIndex(3);
		
		System.out.println(text.getText());
		select.selectByValue("4");
		System.out.println(text.getText());
		select.selectByVisibleText("Option 2");
		System.out.println(text.getText());
		
		 List <WebElement> options = select.getOptions();
		
		for (WebElement option : options){
			System.out.println(option.getText());
			
		}
		
 driver.close();
	}

}
