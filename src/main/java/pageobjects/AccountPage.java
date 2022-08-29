package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage 
{
	WebDriver driver;
	public AccountPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[text()='Edit your account information']")
	WebElement verification;
	
	public WebElement verification()
	{
		return (verification);
	}
}
