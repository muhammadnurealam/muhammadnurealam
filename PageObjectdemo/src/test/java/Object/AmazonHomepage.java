package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomepage {
	//this is a normal fasion
	WebDriver driver;
	
	
	

	public AmazonHomepage(WebDriver driver) {
		this.driver=driver;
	}


	By Signin=By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
	By Email=By.xpath("//input[@id='ap_email']");
	By Continue=By.xpath("//input[@id='continue']");
		
	public WebElement signin() {
		
		return driver.findElement(Signin);
	}
	public WebElement email() {
		
		return driver.findElement(Email);
	}

	public WebElement coontinue() {
		
		return driver.findElement(Continue);
	
		}
	
	}
	
	
