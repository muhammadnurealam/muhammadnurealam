import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jr=(JavascriptExecutor)driver;
		jr.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		
		jr.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,500)");
		
		List<WebElement> values=driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
     int sum= 0;
         for(int i=0; i<values.size();i++) {
        	Integer.parseInt(values.get(i).getText());

        	sum=sum+Integer.parseInt(values.get(i).getText());
	
	}
         System.out.println(sum);  
         
   int totalamount=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
     Assert.assertEquals(sum,totalamount);    
         
	}
	
}
