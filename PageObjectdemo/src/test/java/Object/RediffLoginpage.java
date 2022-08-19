package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	WebDriver driver;
	
	public  RediffLoginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By signin =By.xpath("//input[@name='proceed']");
	
	
	public WebElement Username() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Signin() {
		return driver.findElement(signin);
	}
	
	
	
	
	
	
}
