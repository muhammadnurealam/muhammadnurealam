import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosussestedDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options3 =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		/*for(WebElement option1:options3) {
			if(option1.getText().equalsIgnoreCase("India")) {
				option1.click();
				break;
			}
		
		}*/
		
		for(int i=0;i<options3.size();i++) {
			if(options3.get(i).getText().equalsIgnoreCase("India")){
				options3.get(i).click();
				
			}
					
		}
		

	}

}
