package com.WebShop.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WebShop.qa.base.TestBase;
import com.WebShop.qa.pages.LoginPage;
import com.WebShop.qa.pages.WelcomePage;

public class LoginpageTest extends TestBase{
	
	LoginPage loginpage;
	WelcomePage welcomepage;
	
	public LoginpageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	//browser selection 
	public void setup()
	{
		initialization();
		welcomepage=new WelcomePage();
		loginpage=new LoginPage();
			
	}
	
	//login functionality
	@Test
	
	public void validatelogintest()
	{
		welcomepage.clickonloginbtn();
		loginpage.loginfunctionality(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	//close the browser
	
	@AfterMethod
	
	public void teardown()
	{
		driver.close();
	}

}
