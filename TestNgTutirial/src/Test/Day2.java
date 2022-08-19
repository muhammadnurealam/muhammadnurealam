package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@Parameters({"URL","giko.com"})
	@AfterTest
	public void afterExecute(String urlname,int password) {
		System.out.println("it execute last");
		System.out.println(urlname);
		System.out.println(password);
	}
	@Test(groups= {"smoke"})	
	public void ploan() {
		System.out.println("good");
	}
	@BeforeTest
    public void firstexecute() {
    	System.out.println("it execute first");
    }
	@Test
	public void listerntest1() {
		System.out.println("this is listernes");
		
		Assert.assertTrue(false);
		
		
	}
}
