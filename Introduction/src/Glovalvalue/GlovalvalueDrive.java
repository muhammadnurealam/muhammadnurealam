package Glovalvalue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlovalvalueDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties pro=new Properties();
		FileInputStream fil=new FileInputStream("C:\\Users\\alam_\\seleniumWorkspace\\Introduction\\src\\Glovalvalue\\data.properties");

	pro.load(fil);
	System.out.println(pro.getProperty("browser"));
	System.out.println(pro.getProperty("url"));
	
	pro.setProperty("browser", "firefox");
	System.out.println(pro.getProperty("browser"));
	
	FileOutputStream fol=new FileOutputStream("C:\\Users\\alam_\\seleniumWorkspace\\Introduction\\src\\Glovalvalue\\data.properties");

	pro.store(fol, null);
	
	}

}
