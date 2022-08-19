package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object.FacebookHome;

public class FacebookLofin {
	
	
	@Test
	public void facebookLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		FacebookHome face=new FacebookHome(driver);
		face.firstname().sendKeys("Muhammad");
		face.lastname().sendKeys("giko");
		face.SigninButton().click();
		
		
	}

}
