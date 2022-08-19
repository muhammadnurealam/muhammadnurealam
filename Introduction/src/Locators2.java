import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name="rahul";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    String password=getPassword(driver);
    
	driver.get("http://rahulshettyacademy.com/locatorspractice");
    driver.findElement(By.id("inputUsername")).sendKeys(name);
    driver.findElement(By.name("inputPassword")).sendKeys(password);
    driver.findElement(By.className("signInBtn")).click();
    Thread.sleep(1000);
    System.out.println(driver.findElement(By.tagName("p")).getText());
    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
    Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
    driver.close();
    
	}
	public static String getPassword( WebDriver xyz) throws InterruptedException {
	xyz.get("http://rahulshettyacademy.com/locatorspractice");
	xyz.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(1000);
    xyz.findElement(By.cssSelector(".reset-pwd-btn")).click();
    //Please use temporary password 'rahulshettyacademy' to Login.
    
    String passwordText=xyz.findElement(By.cssSelector("form p")).getText();
    String [] passwordArray1= passwordText.split("'");
    String [] passwordArray2 =passwordArray1[1].split("'");
    String password= passwordArray2[0];
    return password;
    
    
   
	}
}
