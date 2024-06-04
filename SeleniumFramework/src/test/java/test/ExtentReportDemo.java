package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
	
	static WebDriver driver= null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		
		ExtentReports extent = new ExtentReports();
		 extent.attachReporter(spark);
		 
		ExtentTest test=  extent.createTest("Google Search 1", "Open Google and Search");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			//	WebDriver driver	 = new ChromeDriver();
				driver.get("https://google.com/");
		test.log(Status.INFO,"Opened Google");
		 extent.flush();

	}

}
