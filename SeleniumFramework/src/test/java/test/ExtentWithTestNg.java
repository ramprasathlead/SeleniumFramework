package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentWithTestNg {
	
	ExtentReports extent;
	ExtentSparkReporter spark;
	 WebDriver driver;
	 
	 
	@BeforeSuite
	public void setUp() {
		
spark = new ExtentSparkReporter("extentSpark.html");
		 extent = new ExtentReports();
		 extent.attachReporter(spark);
		 
	}
	
	@Test
	public void testRun() {
		
ExtentTest test=  extent.createTest("Google Search 1", "Open Google and Search");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			//	WebDriver driver	 = new ChromeDriver();
				driver.get("https://google.com/");
		test.log(Status.INFO,"Opened Google");
	}

	
    @AfterSuite
	public void tearDown() {
		
		extent.flush();
	}
}
