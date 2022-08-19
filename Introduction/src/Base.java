import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	
		String[] itemsneeded = { "Cucumber", "Brocolli" };

		driver.get("http:rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(4000);
		additems(driver, itemsneeded );
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

         w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void additems(WebDriver driver, String[] itemsneeded ) {
		
	
List <WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0;i<product.size();i++) {
			
			int j=0;
			
			String[] name=product.get(i).getText().split("-");
		
			String formatedName=name[0].trim();
			
			List itemneedelist=Arrays.asList(itemsneeded);
			
			
			if(itemneedelist.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsneeded.length) {
					break;
				}
			}
		}	
				
	}
	
	}
	
