package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutiITDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			//	WebDriver driver	 = new ChromeDriver();
				driver.get("https://easyupload.io/");
				driver.findElement(By.xpath("//button[@class='dz-button']//span")).click();
				Runtime.getRuntime().exec("D:\\AutoIT\\AutoITScript.exe");
				Thread.sleep(2000);
				driver.close();
	}

}
