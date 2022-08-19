package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object.AmazonHomepage;

public class AmazonLogin {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:amazon.com");
		
		
		AmazonHomepage alog= new AmazonHomepage(driver);
		
		alog.signin().click();
		alog.email().sendKeys("alam_giko@yahoo.com");
		alog.coontinue().click();
	
	}
	

}
