import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
			
			driver.findElement(By.xpath("//tr/th[1]")).click();
			
			List<WebElement> elements=driver.findElements(By.xpath("//tr/td[1]"));
			
			List<String>veginame=elements.stream().map(f->f.getText()).collect(Collectors.toList());
			
			List<String> sortedvegi=veginame.stream().sorted().collect(Collectors.toList());
			
			Assert.assertTrue(veginame.equals(sortedvegi));
			
			System.out.println(sortedvegi);
	
			
			List<String>price;
			
			do {
				
				List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		
				price= rows.stream().filter(s->s.getText().contains("Rice"))
		 .map(s->getPrice(s)).collect(Collectors.toList());
			price.forEach(c->System.out.println(c));
			
			if(price.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
				
			}
			
			}while(price.size()<1);
	}

	private static String getPrice(WebElement s) {
		String priceValue=s.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		return priceValue;
	}	

}
