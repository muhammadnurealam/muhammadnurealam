package giko.ExtendReport;

  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendsReportDemo{
	
	ExtentReports extent;

	
	@BeforeTest
	
	public void config() {
		
		//user.dir id path of extentreporter 
		
		String path=System.getProperty("user.dir")+"\\report\\index.html";
		
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		
		report.config().setReportName("web automation result");
		report.config().setDocumentTitle("document result");
		
		ExtentReports extent=new ExtentReports();
		
		
		extent.attachReporter(report);
		
		extent.setSystemInfo("tester", "muhammad");
	}
	
	
	
	
	@Test
	public void intialdemo(){
		

		extent.createTest("intialdemo");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		
		extent.flush();
	}

}
