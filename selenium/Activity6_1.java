package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List <WebElement> columns = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println(columns.size());
        
        List <WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println(rows.size());
        
        List <WebElement> thirdrow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]"));
        for (WebElement items : thirdrow) {
        	System.out.println(items.getText());
        	
        }
        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
    	
        System.out.println("Second row, second column value: " + cellValue2_2.getText());
	
   
	}

}
