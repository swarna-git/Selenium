package tests;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.BaseClass;

public class sampleDBTest extends BaseClass {

		//dataBase username:root123,password:root123
		//DriverManager.getConnection(url, user, password);
		// url -->"jdbc:mysql://"+host+" :"+port+"/databasename";
		//user-->username:root
		//password-->root123
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=DriverIntialize();
	}
	
		@Test
		public void databaseConnection() throws SQLException
		{
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+" :"+port+"/Selenium", "root", "root123");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from data where name='addy'");
		//sample test to fetch data from database and use it for selenium code
		driver.get("https://www.facebook.com/");
		while(rs.next())
			{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(rs.getString("name"));
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(rs.getString("location"));
		    }
		}
			@AfterTest
			public void tearDown()
			{
				driver.close();
				driver=null;
			}

	}
	