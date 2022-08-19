package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        	
		driver.get("https://www.facebook.com/signup");
		WebElement fname=driver.findElement(By.cssSelector("input[name='firstname']"));
		WebElement lname=driver.findElement(By.cssSelector("input[name='lastname']"));
		
		if(fname.isDisplayed()&& fname.isEnabled()) {
			fname.sendKeys("muhammad");
		}
		if(lname.isDisplayed()&& lname.isEnabled()) {
			lname.sendKeys("rahulshettyacademy");
		}
		
		System.out.println(driver.findElement(By.xpath("//label[contains(@for,'u_0_2_/m')]")).isSelected());
		
		if(driver.findElement(By.xpath("//label[contains(@for,'u_0_2_/m')]")).isSelected()==false) {
		driver.findElement(By.xpath("//label[contains(@for,'u_0_2_/m')]")).click();
		}
		
		
	}

}
