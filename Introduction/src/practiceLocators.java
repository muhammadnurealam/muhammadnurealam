import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class practiceLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-gene.rated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElement(By.xpath(" //body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")).isSelected());
		driver.findElement(By.xpath(" //body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ba");
		
		List<WebElement> country=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		
		
		for(int i=0;i<country.size();i++) {
			
			if(country.get(i).getText().equalsIgnoreCase("Bangladesh")) {
				country.get(i).click();
			}
			
		}
		
		
		WebElement sta=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select drop=new Select(sta);
		
		drop.selectByIndex(2);
		drop.getFirstSelectedOption();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.navigate().to("http://www.qaclickacademy.com/");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Set<String> windows= driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
	String parent=	it.next();
		String cgild=it.next();
		
		driver.switchTo().window(cgild);
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert().dismiss();
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
		
		
		}
		
     }
	
	
	
	
	

