import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily")).isSelected());
		driver.findElement(By.cssSelector("input[id*=friendsandfamily")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily")).isSelected());
		System.out.print(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("it is enable");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
