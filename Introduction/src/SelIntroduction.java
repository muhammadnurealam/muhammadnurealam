import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
	
		// invoking browser
		// webdriver is an interface
	
		
		//ChromeDriver Driver = new ChromeDriver();//   chromedriver object will not access other browser 
		// webdriver can access all browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		//driver.close();  close only running tab
	    //driver.quit();  quit all tabs
		
		
	}

}
