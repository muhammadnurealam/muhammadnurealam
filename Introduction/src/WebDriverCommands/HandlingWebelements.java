package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        	
        driver.get("file:///c:/SeleniumPractice/sample.html");
       
	}

}
