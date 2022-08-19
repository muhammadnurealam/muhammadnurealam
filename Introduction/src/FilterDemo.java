import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("input[id='search-field']")).sendKeys("Rice");
		
		List<WebElement> veggi=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement>veggiRice=veggi.stream().filter(p->p.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggi.size(),veggiRice.size());
		
  
	}

}
