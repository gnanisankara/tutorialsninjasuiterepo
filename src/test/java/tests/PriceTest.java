package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import resources.Base;

public class PriceTest extends Base
{
	WebDriver d;
	Actions a;
	
	@BeforeMethod
	public void begin() throws IOException
	{
		d = initializeDriver();
		d.get(prop.getProperty("url"));
	}
	
	@Test
	public void ProductDetails()
	{
		a = new Actions (d);
		LandingPage lp = new LandingPage (d);
		a.moveToElement(lp.desktops()).perform();
		a.moveToElement(lp.mac()).click().perform();
		
		lp.imac().click();
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		System.out.println("");
		System.out.println(lp.pd1().getText());
		System.out.println("Brand: Apple");
		System.out.println("Price: "+lp.pd2().getText());
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("---------------------------");
	}
	
	@AfterMethod
	public void teardown()
	{
		d.close();
	}
}
