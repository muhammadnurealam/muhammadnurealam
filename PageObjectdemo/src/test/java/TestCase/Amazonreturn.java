package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object.AmazonReturn;

public class Amazonreturn {
	
	
	@Test
	public void returni() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:amazon.com");
		
		AmazonReturn re= new AmazonReturn(driver);
		
		re.returnitem().click();
		
		
		
		
		
		
	}
	

}
