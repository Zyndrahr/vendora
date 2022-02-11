package com.vendora.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.vendora.utilities.ScreenRecorderUtil;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass 

{
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws Exception
	{	
		logger = Logger.getLogger("");
		PropertyConfigurator.configure("Log4j.properties");
		ScreenRecorderUtil.startRecord("Vendora");
		
		if(br.equals("chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			
			WebDriverManager.edgedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		 driver.get("http://52.44.68.99:8086/buyer");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	
	@AfterClass
	public void tearDown() throws Exception
	{
		ScreenRecorderUtil.stopRecord();
		driver.quit();
	}
}
