import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1WindowActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
	   driver.get("http://rahulshettyacademy.com/locatorspractice");
	   System.out.println(driver.getTitle());
	   driver.navigate().to("https://facebook.com");
	   System.out.println(driver.getTitle());
       driver.navigate().back();
       System.out.println(driver.getTitle());
       driver.navigate().forward();
       System.out.println(driver.getTitle());
       driver.navigate().refresh();
      // driver.close();
	}

}