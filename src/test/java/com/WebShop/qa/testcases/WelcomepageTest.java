package com.WebShop.qa.testcases;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WebShop.qa.base.TestBase;
import com.WebShop.qa.pages.WelcomePage;

public class WelcomepageTest extends TestBase{
	
	WelcomePage welcomePage;
	
	//load all the property
	
	public WelcomepageTest()
	{
		super();
	}
	
	//browser selection 
	
	@BeforeMethod
	public void setup(){
	 initialization();
	 welcomePage=new WelcomePage();
	}
	
		
	//To click on login button and validate message
	
	@Test
	public void loginbuttontest()
	{
		
		String Welcomemessge=welcomePage.clickonloginbtn();
		
		Assert.assertEquals(Welcomemessge, "Welcome, Please Sign In!");
	}
	
	
	
	
	//To close the browser
	
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
}
