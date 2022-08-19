import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.path2usa.com/travel-companions");
        
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//april 13,2023
       
		
		
		while(!driver.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).getText().contains("April")) {
			//  false of !nagation is true 
			driver.findElement(By.cssSelector("[class=' table-condensed'] [class='next']")).click();
		}
		
		List<WebElement> date=driver.findElements(By.cssSelector("td[class='day']"));
         
        int count= driver.findElements(By.cssSelector("td[class='day']")).size();
        
        for(int i=0; i<count;i++) {
        	String text= driver.findElements(By.cssSelector("td[class='day']")).get(i).getText();
        	if(text.equalsIgnoreCase("20"));
        	driver.findElements(By.cssSelector("td[class='day']")).get(i).click();
        	break;
        	 
        	
        }
        	
	}   
	}


