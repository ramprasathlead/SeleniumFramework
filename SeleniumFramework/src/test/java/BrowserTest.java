import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "D:\\softwares\\SeleniumDrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=WebDriverManager.chromedriver().create();
	//	WebDriver driver	 = new ChromeDriver();
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());

	}

}
 