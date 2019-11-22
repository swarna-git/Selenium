package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import pageObjects.LoginLoadingPage;
import pageObjects.LoginPage;
import resources.BaseClass;

public class LoginTest  extends BaseClass
{
	public static Logger log =LogManager.getLogger(BaseClass.class.getName());
	

	
@BeforeTest
public  void initialize() throws IOException
{
	log.info("initializing driver for Login Testcase");
	driver=DriverIntialize();
	
}
	
@Test(dataProvider="getData")
	public void Login(String username,String password) throws IOException
	{
	 
	 log.info("getting URL QA academy");
	  driver.get(prop.getProperty("url"));
	 LoginLoadingPage LLoad=new LoginLoadingPage(driver);
	 if(LLoad.PoPUpsize()>0)
	 {
		LLoad.PopUp().click(); 
	 }
	log.info("clicking on Login link");
	 LLoad.LoginLoad().click();
	 LoginPage login=new LoginPage(driver);
	 log.info("entering email");
	 login.Email().sendKeys(username);
	 log.info("entering password");
	 login.Password().sendKeys(password);
	 log.info("clicking on submit");
	 login.Submit().click();
	 System.out.println("login test1");
	 System.out.println("made some changes to reflect in git");
	 		
	}
@DataProvider
public Object[][] getData()
{
	
	Object[][] d=new Object[1][2];
	d[0][0]="swarna";
	d[0][1]="sw";
	
	//d[1][0]="addy";
	//d[1][1]="ad";
	
	return d;
	
}
	
@AfterTest
	public void teardown()
	{
	    log.info("closing driver");
		driver.close();
		driver=null;
	}
}
