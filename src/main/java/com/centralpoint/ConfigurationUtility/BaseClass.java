package com.centralpoint.ConfigurationUtility;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.centrepoint.GenericUtility.FileUtility;
import com.centrepoint.WebdriverUtility.WebdriverUtility;





public class BaseClass
{
	
	public FileUtility flib=new FileUtility();
	
	public WebdriverUtility web=new WebdriverUtility();
	
	public static WebDriver driver;
	
	

	
	@BeforeClass
	public void confidBC() throws IOException,MalformedInputException {
		System.out.println("=============launch the browser=============");
		//String Browser=flib.getDataFromPropertyFile("browser");
		//System.getProperty("Browser");
		
//          ChromeOptions opt=new ChromeOptions();
//          opt.addArguments("--headless");
//          driver=new ChromeDriver(opt);
		
		
		
		
//		 ChromeOptions options = new ChromeOptions();
//	        
//	        // Disable JavaScript
//	        options.addArguments("--disable-javascript");
//
//	        // Set the capabilities
//	        DesiredCapabilities capabilities = new DesiredCapabilities();
//	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//
//	        // Initialize WebDriver with the desired capabilities
//	         driver = new ChromeDriver(capabilities);
		
		     driver=new ChromeDriver();
		


		
	
		
		
	}
	@BeforeMethod
	public void  configBM() throws IOException, InterruptedException 
	{
		driver.manage().window().maximize();
		driver.get(flib.getDataFromPropertyFile("url"));
		
	
	}


	@AfterClass
	public void configAC() {
		driver.quit();
	}

}
