package Test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day5 {
	
	@Test(dataProvider="login")
	public void apilogincar(String username, String password) {
		System.out.println("apilogin");
		System.out.println(username);
		System.out.println(password);
		
		Assert.assertTrue(false);
	
	}
	@DataProvider(name="login")
	public Object[][] getdata() {
		
		Object [][] data= new Object [3][2];
		
		data [0][0]= "firstusername";
		data [0][1]="firstpassword";
		
		data [1][0]="secindusername";
		data [1][1]="secondpassword";
		
		data [2][0]="thirdusername";
		data [2][1]="thirdpassword";
		return data;

}
}