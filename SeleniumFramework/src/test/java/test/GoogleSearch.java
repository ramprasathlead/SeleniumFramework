package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//	WebDriver driver	 = new ChromeDriver();
			driver.get("https://google.com/");
		System.out.println(driver.getTitle());
	WebElement	textArea=	driver.findElement((By.xpath("//textarea[@title='Search']")));
	textArea.sendKeys("Automation Step By Step");
	textArea.sendKeys(Keys.RETURN);
	System.out.println("Entered Value");
	//driver.findElement(By.name("btnK")).click();
	
	//driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys(Keys.ESCAPE);
	//System.out.println("Entered Value");
			

	}

}
