package com.WebShop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebShop.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	//Object repository
	
	@FindBy (id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginbtn;
	
	
	//Constructor to initialize page factory object
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void loginfunctionality(String username, String pass)
	{
		//Login into application
		email.sendKeys(username);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
	
	

}
