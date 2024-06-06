package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumWaits {
 static WebDriver driver= null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		waiters();

	}
	
	public static void waiters() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			//	WebDriver driver	 = new ChromeDriver();
				driver.get("https://google.com/");
				
				System.out.println("Entered Value");
				driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("ABCD");
				driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.RETURN);
			String all=	driver.findElement(By.xpath("//div[text()='All']")).getText();
			System.out.println(all);
				
				
				
	}

}
