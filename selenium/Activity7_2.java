package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement multi = driver.findElement(By.id("multi-select"));
		WebElement chosen = driver.findElement(By.id("multi-value"));
		
		Select select = new Select(multi);
		
		if (select.isMultiple()) {
		select.selectByVisibleText("Javascript");
		System.out.println(chosen.getText());
		select.selectByValue("node");
		System.out.println(chosen.getText());
		select.selectByIndex(4);
		select.selectByIndex(5);	
		select.selectByIndex(6);
		System.out.println(chosen.getText());
		select.deselectByValue("node");
		select.deselectByIndex(7);
		List <WebElement> selected = select.getAllSelectedOptions();
	for (WebElement sel : selected){
		
		System.out.println(sel.getText());
	}
		select.deselectAll();
		
		
		
		driver.close();
			
		}
		
		
		
		
		
		

	}

}
