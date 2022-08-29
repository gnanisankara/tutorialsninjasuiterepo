package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class WishlistTest extends Base
{
	WebDriver d;
	Actions a;
	LandingPage lp;
	LoginPage lop;
	
	@BeforeMethod
	public void begin() throws IOException
	{
		d = initializeDriver();
		d.get(prop.getProperty("url"));
		lp = new LandingPage (d);
		lp.myaccount().click();
		lp.loginc().click();
		
		lop = new LoginPage (d);
		lop.loginid().sendKeys("arun.selenium@gmail.com");
		lop.password().sendKeys("Second@123");
		lop.loginbut().click();
	}
	
	@Test
	public void wishlist()
	{
		a = new Actions (d);
		lop = new LoginPage (d);
		a.moveToElement(lop.desktops()).perform();
		a.moveToElement(lop.mac()).click().perform();
		a.moveToElement(lop.heart()).click().perform();
		
		try
		{
			lop.hclicked().isDisplayed();
			System.out.println("Successfully Added to Wishlist");
		}
		catch (Exception e)
		{
			System.out.println("Wishlist Empty");
		}
	}
	
	@AfterMethod
	public void teardown()
	{
		d.close();
	}
}
