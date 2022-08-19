package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object.RediffLoginpage;

public class LoginApplication {
	
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpage redlog=new RediffLoginpage(driver);
		
		redlog.Username().sendKeys("hellow");
		redlog.Password().sendKeys("hellow");
		redlog.Signin().click();
	}
}
