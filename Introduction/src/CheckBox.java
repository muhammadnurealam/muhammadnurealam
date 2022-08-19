import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily")).isSelected());
		driver.findElement(By.cssSelector("input[id*=friendsandfamily")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily")).isSelected());
		System.out.print(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
