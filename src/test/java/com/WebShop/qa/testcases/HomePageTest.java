package com.WebShop.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WebShop.qa.base.TestBase;
import com.WebShop.qa.pages.HompPage;
import com.WebShop.qa.pages.LoginPage;
import com.WebShop.qa.pages.WelcomePage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	WelcomePage welcomepage;
	HompPage Homepage;
	
	//call parent class constructor to initialize the property
	
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	//browser selection and login into application
	public void setup()
	{
		initialization();
		welcomepage=new WelcomePage();
		loginpage=new LoginPage();
		Homepage=new HompPage();
		welcomepage.clickonloginbtn();
		loginpage.loginfunctionality(prop.getProperty("username"),prop.getProperty("password"));
	
	}
	
	//Actual test cases
	
	@Test(priority=0)
	
	public void validateuseridTest()
	
	{
		String userid=Homepage.validateuserid();
		Assert.assertEquals(userid,"testdemowebshop@gmail.com");
	}
	
	@Test(enabled=false)
	public void validatecartemptytest()
	{
		Homepage.valiateshoppincareempty();
	}
	
	@Test(priority=1)
	public void validatebookselecttest()
	{
		Homepage.selectBooksmenu();
	}
	
	@Test(priority=2)
	public void selectabooktest()
	{
		Homepage.selectBooksmenu();
		Homepage.selectbook();
	}
	
	@Test(priority=3)
	
	public void getbookpricetest()
	   {
		Homepage.selectBooksmenu();
		Homepage.selectbook();
		String bookprice=Homepage.getbookprice();
		System.out.println(bookprice);
	   }
	   
	  @Test(priority=4)
	   public void enterbookquantitytest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
	   }
	   
	   
	@Test(priority=5)
	   public void validatetaddtocarttest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
	   }
	
	   
	  @Test(priority=6)
	   
	   public void validatprodaddcartmessgetest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   String cartmessgae=Homepage.productaddedtocartmsg();
		   Assert.assertEquals(cartmessgae, "The product has been added to your shopping cart");
	   }
	   
	  @Test(priority=7)
	   
	   public void validatesubtotaltest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   String subtotal=Homepage.checksubtotal();
		   Assert.assertEquals(subtotal, "30.00");
	   }
	   
	 @Test(priority=8)
	   
	   public void validateclickoncheckouttest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
	   }
	   
	  @Test(priority=9)
	   public void validatebillingaddrssselectionest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
		   Homepage.Selectnewaddress();
	   }
	   
	  @Test(priority=10)
	    public void validatebillingadddatatest()
	    {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
		   Homepage.Selectnewaddress();
		   Homepage.billingaddressdetail();
	   }
	    
	   @Test(priority=11)
	   public void validateshippingaddtest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
		   Homepage.Selectnewaddress();
		   Homepage.billingaddressdetail();
		   Homepage.selectshippingaddress();
	   }
	   
	 @Test(priority=12)
	   public void validateshippingmethodtest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
		   Homepage.Selectnewaddress();
		   Homepage.billingaddressdetail();
		   Homepage.selectshippingaddress();
		   Homepage.selectshippingmethod();
	   }
	   
	@Test(priority=13)
	   public void validatepaymentmethod()
	   {
	   Homepage.selectBooksmenu();
	   Homepage.selectbook();
	   Homepage.enterquantity();
	   Homepage.addtocart();
	   Homepage.clickoncart();
	   Homepage.clickoncheckout();
	   Homepage.Selectnewaddress();
	   Homepage.billingaddressdetail();
	   Homepage.selectshippingaddress();
	   Homepage.selectshippingmethod();
	   Homepage.selectpaymentmethod();
		   
	   }
	   
	  @Test(priority=14)
	   
	   public void validatepaymentinfotest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
		   Homepage.Selectnewaddress();
		   Homepage.billingaddressdetail();
		   Homepage.selectshippingaddress();
		   Homepage.selectshippingmethod();
		   Homepage.selectpaymentmethod();
		   String messgae=Homepage.paymentinfo();
		   System.out.println(messgae);
		   Assert.assertEquals(messgae, "You will pay by COD");
	   }
	   
	  @Test(priority=15)
	   public void validateconfirmordertest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
		   Homepage.Selectnewaddress();
		   Homepage.billingaddressdetail();
		   Homepage.selectshippingaddress();
		   Homepage.selectshippingmethod();
		   Homepage.selectpaymentmethod();
		   Homepage.paymentinfo();
		   Homepage.confirmorder();
	   }
	   
	  @Test(priority=16)
	   public void validateorderprocessedtest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
		   Homepage.Selectnewaddress();
		   Homepage.billingaddressdetail();
		   Homepage.selectshippingaddress();
		   Homepage.selectshippingmethod();
		   Homepage.selectpaymentmethod();
		   Homepage.paymentinfo();
		   Homepage.confirmorder();
		   String ordermessgae=Homepage.orderprocessed();
		   Assert.assertEquals(ordermessgae,"Your order has been successfully processed!");
	   }
	  
	  @Test(priority=17)
	   public void validatecompltedordertest()
	   {
		   Homepage.selectBooksmenu();
		   Homepage.selectbook();
		   Homepage.enterquantity();
		   Homepage.addtocart();
		   Homepage.clickoncart();
		   Homepage.clickoncheckout();
		   Homepage.Selectnewaddress();
		   Homepage.billingaddressdetail();
		   Homepage.selectshippingaddress();
		   Homepage.selectshippingmethod();
		   Homepage.selectpaymentmethod();
		   Homepage.paymentinfo();
		   Homepage.confirmorder();
		   Homepage.orderprocessedcomplete();
	   }
	  
	    
	@AfterMethod()
	
	public void teardown()
	{
		driver.quit();
	}

}
