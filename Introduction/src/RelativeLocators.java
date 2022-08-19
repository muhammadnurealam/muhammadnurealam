import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 
		WebElement rname= driver.findElement(By.cssSelector("input[name='name']"));
		                           
		System.out.println(driver.findElement(with(By.tagName("label")).above(rname)).getText());
		WebElement result=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(result)).click();
		WebElement left=driver.findElement(By.cssSelector("[for=exampleCheck1]"));
		driver.findElement(with(By.tagName("input")).toLeftOf(left)).click();
		WebElement right=driver.findElement(By.cssSelector("[id='inlineRadio1']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(right)).getText());
		
		

	}

}
