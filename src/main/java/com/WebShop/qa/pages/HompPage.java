package com.WebShop.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WebShop.qa.base.TestBase;


public class HompPage extends TestBase {
	
	//page factory -OR
	
	@FindBy (linkText="testdemowebshop@gmail.com")
	WebElement accountid;
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement shoppingcart;
	
	@FindBy(name="removefromcart")
	WebElement checkbox;
	
	@FindBy(name="updatecart")
	WebElement updatecartbtn;
	
	@FindBy(linkText="Books")
	WebElement Booksoption;
	
	@FindBy(xpath="//div[@class='product-grid']//a[contains(text(),'Health Book')]")
	WebElement book;
	
	@FindBy(xpath="//span[@itemprop='price']")
	WebElement bookprice;
	
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement bookquantity;
	
	@FindBy(xpath="//input[@id='add-to-cart-button-22']")
	WebElement addtocart;
	
	@FindBy(xpath="//p[@class='content']")
	WebElement productaddcartessage;
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	WebElement shoppingcartlink;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkoutbtn;
	
	@FindBy(id="termsofservice")
	WebElement termconditioncheckbox;
	
	@FindBy(xpath="//span[contains(text(),'Sub-Total:')]/../following-sibling::td")
	WebElement subtotaltext;
	
	@FindBy(id="billing-address-select")
	WebElement billingaddrssdropdown;
	
	@FindBy(id="BillingNewAddress_FirstName")
	WebElement billingadressfirstname;
	
	@FindBy(id="BillingNewAddress_LastName")
	WebElement billingadresslastname;
	
	@FindBy(id="BillingNewAddress_Email")
	WebElement billingadressemail;
	
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement countrydropdown;
	
	@FindBy(id="BillingNewAddress_City")
	WebElement bilingaddrcity;
	
	@FindBy(id="BillingNewAddress_Address1")
	WebElement billingaddrss;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement billingaddzip;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement billingaddphone;
	
	@FindBy(xpath="//input[@onclick='Billing.save()']")
     WebElement billingaddcontinue;	
	
	@FindBy(id="shipping-address-select")
	WebElement shippingaddress;
	
	@FindBy(xpath="//input[@onclick='Shipping.save()']")
	WebElement shippingaddcontinue;
	
	@FindBy(xpath="//input[@value='Next Day Air___Shipping.FixedRate']")
	WebElement shippingmethod;
	
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	WebElement shippingmethodcontinue;
	
	@FindBy(xpath="//input[@id='paymentmethod_0']")
	WebElement paymentmethod;
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	WebElement paymentmethodcontinue;
	
	@FindBy(xpath="//tbody//p")
	WebElement payementinfo;
	
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	WebElement paymentcontinue;
	
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	WebElement confirmorder;
	
	@FindBy(xpath="//div[@class='title']/strong")
	WebElement ordermessgae;
	
	@FindBy(xpath="//ul[@class='details']/li[contains(text(),'Order number:')]")
    WebElement odrderno; 
	
	@FindBy(xpath="//input[@class='button-2 order-completed-continue-button']")
	WebElement orderprocesscontinue;
	
	@FindBy(xpath="//input[@class='button-2 order-completed-continue-button']")
	WebElement ordercompletedcontinue;
	
	//initializing the page object element
	
	public HompPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateuserid()
	{
		//To validate the userid
		return accountid.getText();
	}
	
	public void valiateshoppincareempty()
	
	{
		//validate shopping cart is empty
		shoppingcart.click();
		checkbox.click();
		updatecartbtn.click();
		
	}
	
	public void selectBooksmenu()
	{
		//This method is to select the bookmenu
		Booksoption.click();
	}
	
	
	public void selectbook()
	{
		//This method is to select the book from list if books
		
		book.click();
	}
	
	public String getbookprice()
	{
		//This method is to get the price of the selected book 
		return bookprice.getText();
	}
	
	public void enterquantity()
	{
		//This method is to enter the quantity
		bookquantity.clear();
		bookquantity.sendKeys("3");
	}
	
	public void addtocart()
	{
		//This method is to add the book into cart
		addtocart.click();
	}
	
	public String productaddedtocartmsg()
	{
		//This method is to validate the product added to cart
		return productaddcartessage.getText();
	}
	
	public void clickoncart()
	{
		//This method is to click on cart link
		shoppingcartlink.click();
	}
	
	public String checksubtotal()
	{
		//This method is to check the subtotal of selected book
		return subtotaltext.getText();
		
			
	}
	
	public void clickoncheckout()
	{
		//This method is to click on checkout button
		termconditioncheckbox.click();
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeSelected(termconditioncheckbox));
		
		checkoutbtn.click();
	}
	
	public void Selectnewaddress()
	{
		//This method is select new address
		Select select=new Select(billingaddrssdropdown);
		select.selectByVisibleText("New Address");
		
	}
	
	public void billingaddressdetail()
	{
		//This method is to enter billing address details 
		billingadressfirstname.clear();
		billingadressfirstname.sendKeys("shrini");
		billingadresslastname.clear();
		billingadresslastname.sendKeys("tagal");
		billingadressemail.clear();
		billingadressemail.sendKeys("abd123@gmail.com");
		
		Select select=new Select(countrydropdown);
		select.selectByVisibleText("United States");
		
		bilingaddrcity.clear();
		bilingaddrcity.sendKeys("Pune");
		billingaddrss.clear();
		billingaddrss.sendKeys("Pimple saudagar");
		
		billingaddzip.clear();
		billingaddzip.sendKeys("411011");
		
		billingaddphone.clear();
		billingaddphone.sendKeys("9822000000");
		
		billingaddcontinue.click();
		
	}
	
	public void selectshippingaddress()
	{
		//This method is to select shipping address
		Select select=new Select(shippingaddress);
		select.selectByVisibleText("shrini tagal, Pimple saudagar, Pune, AA (Armed Forces Americas) 411011, United States");
		shippingaddcontinue.click();
	}

	public void selectshippingmethod()
	{
		//This method is select the shipping method
		shippingmethod.click();
		shippingmethodcontinue.click();
	}
	public void selectpaymentmethod()
	{
		//This method is to select payment method 
		paymentmethod.click();
		paymentmethodcontinue.click();
	}
	
	public String paymentinfo()
	{
		//This method is to validate the message" You will pay by COD"
		paymentcontinue.click();
		return payementinfo.getText();
	}
	
	public void confirmorder()
	{
		//This method is to click on confirm order
		confirmorder.click();
	}

	public String orderprocessed()
	{
		//This method is vlidate "Your order has been successfully processed!" and print order number
		System.out.println(odrderno.getText());
		return ordermessgae.getText();
	}
	
	public void orderprocessedcomplete()
	{
		//This method is to click on continue button
		ordercompletedcontinue.click();
	}
}
