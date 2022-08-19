package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	
	
	@BeforeClass
	public void beforeclass(String urlname) {
		System.out.println("before all method i will execute first");
		System.out.println(urlname);
	}
	@Test(groups= {"smoke"})
	
	public void weblogincar() {
		
		System.out.println("weblogin");		
	}
	@BeforeSuite
	public void beforesuit() {
		System.out.println("i am no 1");
	}
	@Test(enabled=false)

public void mobilelogincar() {
		System.out.println("mobilelogin");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after all method i will exuecute last");
	}

	
			
				
		
	}

