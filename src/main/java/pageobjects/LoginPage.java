package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@id='input-email']")
	WebElement loginid;
	
	@FindBy (xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy (xpath="//input[@value='Login']")
	WebElement loginbut;
	
	@FindBy (xpath="//a[text()='Desktops']")
	WebElement dekstops;
	
	@FindBy (xpath="//a[text()='Mac (1)']")
	WebElement mac;
	
	@FindBy (xpath="(//i[@class='fa fa-heart'])[2]")
	WebElement heart;
	
	@FindBy (xpath="//span[text()='Wish List (1)']")
	WebElement hclicked;
	
	@FindBy (xpath="//button[@data-original-title='Add to Cart']")
	WebElement addtocart;
	
	@FindBy (xpath="(//button[@type='button'])[5]")
	WebElement cart;
	
	@FindBy (xpath="(//i[@class=\"fa fa-share\"])[2]")
	WebElement cout;
	
	public WebElement loginid()
	{
		return (loginid);
	}
	
	public WebElement password()
	{
		return (password);
	}
	
	public WebElement loginbut()
	{
		return (loginbut);
	}
	
	public WebElement desktops()
	{
		return (dekstops);
	}
	
	public WebElement mac()
	{
		return (mac);
	}
	
	public WebElement heart()
	{
		return (heart);
	}
	
	public WebElement hclicked()
	{
		return (hclicked);
	}
	
	public WebElement addtocart()
	{
		return (addtocart);
	}
	
	public WebElement cart()
	{
		return (cart);
	}
	
	public WebElement cout()
	{
		return (cout);
	}
}
