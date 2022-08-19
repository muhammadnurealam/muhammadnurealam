import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTestng {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id*=friendsandfamily")).isSelected();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=friendsandfamily")).isSelected());

		driver.findElement(By.cssSelector("input[id*=friendsandfamily")).click();		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=friendsandfamily")).isSelected());
		
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
	}

}
