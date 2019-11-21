package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.GetTitlePage;
import resources.BaseClass;

public class GetTitleTest extends BaseClass {

	public static Logger log =LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	public  void initialize() throws IOException
	{
		log.info("initializing the driver for getTitle testcase");
		driver=DriverIntialize();
		log.info("getting the url");
		driver.get(prop.getProperty("url"));
		 
		
	}
		
	@Test
	
	
	
		public void getTitle() throws IOException
		{
		   //WebDriverWait Wait=new WebDriverWait(driver,10);
		 // Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='sumome-react-wysiwyg-popup-animation-group']")));
	      //driver.findElement(By.cssSelector("div[class*='sumome-react-wysiwyg-is-resizing'] div:nth-child(7)")).click();
		  GetTitlePage t=new GetTitlePage(driver);
		  log.info("getting the title");
		  System.out.println(t.PrintTitle().getText());
		  log.info("asserting the titles");
		  Assert.assertEquals( t.PrintTitle().getText(),"FEATURED COURSES123");
		  
		   
		   
		   
		   
		   
		   
		  
		  
	}

@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
