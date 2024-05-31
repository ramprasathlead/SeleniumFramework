package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver=null;
	By serchBox= By.xpath("//textarea[@title='Search']");
	
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver= driver;
	}
	
	
	public void writeTextinSearchBox(String searchText) {
		
		driver.findElement(serchBox).sendKeys(searchText);
	}
	
public void keyBoardEnterinSearchBox() {
		
		driver.findElement(serchBox).sendKeys(Keys.RETURN);
	}

}
