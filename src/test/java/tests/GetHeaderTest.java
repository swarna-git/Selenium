package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.GetHeaderPage;
import resources.BaseClass;

public class GetHeaderTest extends BaseClass {

	public static Logger log =LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	public  void initialize() throws IOException
	{
		log.info("initializing driver for getHeader Testcase");
		driver=DriverIntialize();
		
		
	}
		
	@Test
		public void getHeader() throws IOException
		{
		log.info("getting the url");
		  driver.get(prop.getProperty("url"));
		  GetHeaderPage GetBar=new GetHeaderPage(driver);
		  //List<WebElement> NavList
		  log.info("printing the navigation bar");
		 System.out.println(GetBar.NavBar().getText());
		  
		  		
		}
		
	@AfterTest
		public void teardown()
		{
		log.info("closing the driver");
			driver.close();
			driver=null;
		}

}
