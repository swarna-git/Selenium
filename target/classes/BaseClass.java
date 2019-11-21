package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
    public Properties prop;
	
		public WebDriver DriverIntialize() throws IOException
	{
	 prop=new Properties();
	FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\config.properties");
	prop.load(fi);
	//String browserName=System.getProperty("browser");
	String browserName=prop.getProperty("browser");

		if(browserName.contains("chrome"))
	{
			System.out.println(browserName);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
			if(browserName.contains("--headless"))
		      {
			options.addArguments("headless");
	
		      }
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
				
	}
	else
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sunde\\OneDrive\\Desktop\\BrowserDrivers\\MicrosoftWebDriver.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
	
	}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	return driver;

	}
 public void getScreenShot(String result) throws IOException
 {
	 Date d=new Date();
	 String date = d.toString().replace(":", "_").replace(" ", "_");
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C://Users//sunde//Scrnsht_Eclipse_E2E//" + " " +date.toString()+" "+result+"screenshot.png"));
	System.out.println(d.toString());	
	 
 }
		
		
		
}


