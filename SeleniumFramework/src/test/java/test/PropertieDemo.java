package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertieDemo {
	static Properties prop= new Properties();
	static  String projectPath= System.getProperty("user.dir");
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		getProperties();
		setProperties();
		getProperties();
		

	}
	
	public static void getProperties() {
		try {
			 
			 //String projectPath= System.getProperty("user.dir");
			
				
			// Properties prop= new Properties();
			InputStream input= new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			 prop.load(input);
			 
			 String browser=prop.getProperty("browser");
			 System.out.println(browser);
			 
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void setProperties() {
		
		try {
			OutputStream output= new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
		    prop.setProperty("browser", "edge");
		   prop.store(output, "nothing");
		   String browser=prop.getProperty("browser");
		   System.out.println(browser);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
