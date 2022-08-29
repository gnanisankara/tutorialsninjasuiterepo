package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage 
{
	WebDriver driver;
	public LandingPage(WebDriver d)								//Constructor for LandingPage
	{
		driver = d;
		PageFactory.initElements(driver, this);					//Initialization of page factory 
	}
	
	@FindBy (xpath="//a[@title='My Account']")					//locating myaccount option on the landing page
	WebElement myaccount;
	
	@FindBy (xpath="//a[text()='Login']")						//locating login optoin on the login page
	WebElement loginc;
	
	@FindBy (xpath="//a[text()='iMac']")
	WebElement imac;
	
	@FindBy (xpath="//h1[text()='iMac']")
	WebElement pd1;
	
	@FindBy (xpath="//ul/li/h2")
	WebElement pd2;
	
	@FindBy (xpath="//a[text()='Desktops']")
	WebElement dekstops;
	
	@FindBy (xpath="//a[text()='Mac (1)']")
	WebElement mac;
	
	public WebElement myaccount()
	{
		return (myaccount);
	}
	
	public WebElement loginc()
	{
		return (loginc);
	}
	
	public WebElement imac()
	{
		return (imac);
	}
	
	public WebElement pd1()
	{
		return (pd1);
	}
	
	public WebElement pd2()
	{
		return (pd2);
	}
	
	public WebElement desktops()
	{
		return (dekstops);
	}
	
	public WebElement mac()
	{
		return (mac);
	}
}
