package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			//	WebDriver driver	 = new ChromeDriver();
				driver.get("https://google.com/");
			System.out.println(driver.getTitle());
	}
	@Test
	public void googleSearch() {
		WebElement	textArea=	driver.findElement((By.xpath("//textarea[@title='Search']")));
		textArea.sendKeys("Automation Step By Step");
		textArea.sendKeys(Keys.RETURN);
		System.out.println("Entered Value");
		
		
	}
	@AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("Exceution Completed");
	}
}
