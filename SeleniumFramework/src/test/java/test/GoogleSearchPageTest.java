package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;
public class GoogleSearchPageTest {
	
	private static WebDriver driver= null;
	static String searcKeyword= "Wonderland";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearchTest();

	}

	public static void googleSearchTest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			//	WebDriver driver	 = new ChromeDriver();
				driver.get("https://google.com/");
		
		GoogleSearchPageObjects searchObject= new GoogleSearchPageObjects(driver);
		searchObject.writeTextinSearchBox(searcKeyword);
		searchObject.keyBoardEnterinSearchBox();
		
	}
}
