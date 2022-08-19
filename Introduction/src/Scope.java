import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		//link size of alltab
		System.out.println(driver.findElements(By.tagName("a")).size());
		//link size on fottersection
		
		WebElement fotterDriver=driver.findElement(By.cssSelector("#gf-BIG"));
		
		System.out.println(fotterDriver.findElements(By.tagName("a")).size());
		//link size on columnsection
		WebElement columDriver=fotterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columDriver.findElements(By.tagName("a")).size());
		
		//open all links as a new tab then grave title of links
		
		for(int i=1; i<columDriver.findElements(By.tagName("a")).size();i++){
			
			String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);// by using get new tab
			
			
			columDriver.findElements(By.tagName("a")).get(i).sendKeys(tab);
			
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> xyz=abc.iterator();
		
		while(xyz.hasNext()) {
			driver.switchTo().window(xyz.next());
			
			System.out.println(driver.getTitle());
		}
		
	}
}
