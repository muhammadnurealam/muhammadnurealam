package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Base {
	 
	public WebDriver driver;	
	public Properties pro;
		
	public WebDriver intilizing() throws IOException {
     pro= new Properties();    
    FileInputStream fie= new FileInputStream("C:\\Users\\alam_\\seleniumWorkspace\\EndToEnd\\src\\main\\java\\resource\\Data.properties");
		
		pro.load(fie);
		
	pro.getProperty("browser");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
	driver=new ChromeDriver();
	pro.getProperty("url");
	
	
		
	/*if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		driver=new ChromeDriver();
	}
		
	else if(browserName=="firefox")	{
		
	}
	else if(browserName=="IE") {
	}*/	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
		
	}
	
	public void getScreenShort(String TestCaseName) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File soucce=ts.getScreenshotAs(OutputType.FILE);
	String destinationfile= System.getProperty("user.dir")+ "\\reports\\"+TestCaseName+".png";
	
	FileUtils.copyFile(soucce,new File(destinationfile));
	}
	}

