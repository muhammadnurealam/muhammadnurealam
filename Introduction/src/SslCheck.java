


import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option= new ChromeOptions();
		
		Proxy pro= new Proxy();
		
		pro.setHttpProxy("ipaddress:2334");
		option.setCapability("proxy",pro); // proxy address set as a string.
		
		
		
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alam_\\seleniumWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());

	}

}
