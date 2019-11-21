package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLoadingPage {

	 public WebDriver driver;

		public LoginLoadingPage(WebDriver driver)
		   {
			   this.driver=driver;
		   }

		
	  		
		 private By LoginLoad=By.cssSelector("a[href*='sign_in']");
		 private By PopUpNOTHANKS=By.xpath("//button[contains(text(),'NO THANKS')]");
		
		
		public WebElement LoginLoad()
		{
			return driver.findElement(LoginLoad);
		}
		public int PoPUpsize()
		{
			return driver.findElements(PopUpNOTHANKS).size();
		}
		public WebElement PopUp()
		{
			return driver.findElement(PopUpNOTHANKS);
		}
}
