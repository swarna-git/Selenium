package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	
By Email=By.id("user_email");


By Password=By.id("user_password");

By Submit=By.xpath("//input[@name='commit']");


public WebElement Email()
{
	return driver.findElement(Email);
}
		
public WebElement Password()
{
	return driver.findElement(Password);
}

public WebElement Submit()
{
	return driver.findElement(Submit);
}

}