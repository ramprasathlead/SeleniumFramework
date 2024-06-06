package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowserTestNg {
	WebDriver driver=null;
	
	@BeforeTest
	@Parameters("browserName")
	public void setUp(String browserName) {
		
		if(browserName.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		
		else if (browserName.equals("edge")) {
			
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		
		else {
			
			System.out.println("No broswer available");
		}
	}
	
	@Test
	public void test1() {
		
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}
	
	

}
