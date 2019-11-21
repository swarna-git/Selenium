package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetHeaderPage {

	public WebDriver driver;

	public GetHeaderPage( WebDriver driver)
	{
		this.driver=driver;
	}
	
	By NavBar =By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	public WebElement NavBar()
	{
		return driver.findElement(NavBar);
	}
}

