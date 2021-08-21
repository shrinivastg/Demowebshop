package com.WebShop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebShop.qa.base.TestBase;

public class WelcomePage extends TestBase{
	
//Object repository
	@FindBy (xpath="//a[contains(text(),'Log in')]")
	WebElement loginbutton;
	
	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	WebElement Welcomemessgae;
	
	//initializing page objects
	public WelcomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	//click on login button and validatemssgae
	public String clickonloginbtn()
	{
		loginbutton.click();
		String messagetxt= Welcomemessgae.getText();
		return messagetxt;
	}

	
	
}
