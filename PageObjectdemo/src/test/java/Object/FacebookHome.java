package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHome {
	//this is lates fashin page factory
	WebDriver driver;
	
	public FacebookHome(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement LastName;
	
	@FindBy(xpath="//button[@name='websubmit']")
	
	WebElement Signin;
	
	
	public WebElement firstname() {
		return FirstName;
	}
	
	public WebElement lastname() {
		return LastName;
	}
	
	public WebElement SigninButton() {
		return Signin;
	}
}