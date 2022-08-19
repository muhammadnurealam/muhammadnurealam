

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("asasasd");
		
		driver.get("https://qatarairways.com/");
		
		
		
		File src= (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		
		FileUtils.copyFile(src,new File("C:\\Users\\alam_\\screenshort"));
		
		
		// we take screen shot by using this method.
		
	}

}
