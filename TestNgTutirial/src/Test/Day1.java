package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day1 {
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	
	public void demo(String urlname) {
		System.out.println("hellow");
		System.out.println(urlname);
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
		
	}
	
	@Test
	public void thirdTest(String urlname,String key) {
		System.out.println("comeinagain");
		System.out.println(urlname);
		System.out.println(key);
	}

}