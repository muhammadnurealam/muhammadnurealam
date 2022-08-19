import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:rahulshettyacademy.com/AutomationPractice/");
		
		//broken links mean url is not woking 
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a= new SoftAssert();
		
		for(WebElement link:links) {
		
		String url=link.getAttribute("href");
		
	    HttpURLConnection conn=(HttpURLConnection)new  URL(url).openConnection();
	
	conn.setRequestMethod("HEAD");
	conn.connect();
	int code=conn.getResponseCode();
	System.out.println(code);
	
	a.assertTrue(code>400, "the broken link is="+link.getText()+"  and code is  "+ code);
	 
	}
		a.assertAll();
		
	}
}