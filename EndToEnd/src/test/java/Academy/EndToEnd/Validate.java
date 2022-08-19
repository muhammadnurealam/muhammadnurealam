package Academy.EndToEnd;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resource.Base;

public class Validate extends Base {
	
	public WebDriver driver;
	@BeforeTest
	
	public void inittlizing() throws IOException {
		driver = intilizing();

		driver.get(pro.getProperty("url"));
	}
	
	@Test

	public void pagetitle() throws IOException {

		
		LandingPage lo = new LandingPage(driver);

		Assert.assertEquals(lo.getTitle().getText(), "FEATURED COURSES123");

	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}