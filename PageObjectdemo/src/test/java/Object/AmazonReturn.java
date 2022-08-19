package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonReturn {
	
	WebDriver driver;
	
	
	
	
	public AmazonReturn(WebDriver driver) {
		this.driver=driver;
	}



	By Return=By.xpath("//a[@id='nav-orders']");
	
	public WebElement  returnitem() {
		return driver.findElement(Return);
	}

}
