package com.WebShop.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	//global variable 
	public static WebDriver driver;
	public static Properties prop;
	
	//TestBase constuctor to initialize the propertis object to fetch config variable.
	public TestBase()  
	{
		try{
		prop=new Properties();
	
		FileInputStream fis=new FileInputStream("C://Users//Amruta\\workspace//DemoWebShopTest//src//main//java//com//WebShop//qa//config//config.propeties");
	    prop.load(fis);
		}catch(Exception e)
	{
		e.printStackTrace();
	}
	
			
	}
//Initialization of Webdriver 	
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Radical_software\\Firefox\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			
		driver.get(prop.getProperty("url"));
	}
	

}
