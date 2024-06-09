package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChrome {
static WebDriver driver= null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		headless();
	}
	
	public static void headless() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--headless");
		driver= new ChromeDriver(opt);
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
	WebElement	textArea=	driver.findElement((By.xpath("//textarea[@title='Search']")));
	textArea.sendKeys("Automation Step By Step");
	System.out.println("Execution cmpleted");
		
	}

}
