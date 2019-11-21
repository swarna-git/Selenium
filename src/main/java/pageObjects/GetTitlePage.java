package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTitlePage {
	
	public WebDriver driver;
	public GetTitlePage(WebDriver driver)
	{
		this.driver=driver;
	}

 By Title=By.cssSelector("div[class='text-center'] h2");
 
 
 public WebElement PrintTitle()
	{
		return driver.findElement(Title);
	}
	
}
