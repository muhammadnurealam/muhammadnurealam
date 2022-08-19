package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 {
	@Test(timeOut=4000)
	
	public void webloginHome() {
		
		System.out.println("weblogin");		
	}
	@AfterSuite
	
	public void aftersuite() {
		System.out.println("i am no 1 last");
	}
	@Test(groups={"smoke"})
	
public void mobileloginHome() {
		System.out.println("mobilelogin");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("i will execute first before every test cases");
	}
	@AfterMethod
	public void afteremethod() {
		System.out.println("i will execute last before every test cases");
	}
	@Test(dependsOnMethods= {"webloginHome","mobileloginHome"})
	public void apiloginHome() {
		System.out.println("apilogin");
	}
}
