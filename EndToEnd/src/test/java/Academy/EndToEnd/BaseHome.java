package Academy.EndToEnd;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resource.Base;

public class BaseHome extends Base {	
	
	//public WebDriver driver;
	
	@BeforeTest	
	public void intillizing() throws IOException {
		
		driver = intilizing();
		
		
	}	
	@Test(dataProvider = "getData")
	public void login(String email, String password, String text) throws IOException {
		driver.get(pro.getProperty("url"));
		LandingPage land = new LandingPage(driver);
		land.Signin().click();
		LoginPage log = new LoginPage(driver);
		log.Email().sendKeys(email);
		log.Password().sendKeys(password);
		System.out.println(text);
		log.Login().click();
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "ajajaj";
		data[0][1] = "11223";
		data[0][2] = "nonrestected";

		data[1][0] = "hjdjkdkd";
		data[1][1] = "637337";
		data[1][2] = "rastected";
		return data;
	}
	@AfterTest
	public void Teardown() {
		driver.close();
	}

	
}
