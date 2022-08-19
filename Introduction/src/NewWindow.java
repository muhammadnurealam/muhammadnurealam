import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		 //switching window
	
		 driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handels= driver.getWindowHandles();
		
		Iterator<String> it=handels.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		
		driver.get("https://rahulshettyacademy.com");	
		String coursename=	driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
	
		driver.switchTo().window(parent);
		
		//webelement screenshort
		
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
				name.sendKeys(coursename);
				
				File file=name.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(file, new File("logo.png"));
				
				//get hieght and width
				
			System.out.println(name.getRect().getDimension().getHeight());
				
			System.out.println(name.getRect().getDimension().getWidth());
				
				
				
				
		
		
		
	}

}
