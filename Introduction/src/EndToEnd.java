import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		//driver.findElement(By.cssSelector("a[class='ui-state-default.ui-state-highlight']")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5")) {
			System.out.println("its disable");
			Assert.assertTrue(true);
			
		}
				
		else{
			Assert.assertTrue(false);
		}
		
	driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
	
	
	int i=1;
	while(i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		
		
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	WebElement options = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
	Select option= new Select( options);
	
	option.selectByIndex(2);
	System.out.println(option.getFirstSelectedOption().getText());
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
	}
	
	

}
