package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base 				//Used to inherit initializeDriver method from the base class
{
	WebDriver d;
	@Test (dataProvider="getCredentials")
	public void login(String id, String pw) throws IOException
	{
		//Creating object for landing page to access the webelements on the landing page
		LandingPage lp = new LandingPage (d);
		lp.myaccount().click();
		lp.loginc().click();
		
		//Creating object for login page to access the WebElements on the login page
		LoginPage lop = new LoginPage(d);
		lop.loginid().sendKeys(id);
		lop.password().sendKeys(pw);
		lop.loginbut().click();
		
		//Verifying login
		AccountPage ap = new AccountPage(d);
		ap.verification().isDisplayed();
		
		/*try
		{
			ap.verification().isDisplayed();
			System.out.println("Logged in Successfully using the username "+id+" and the passowrd "+pw);
		}
		catch (Exception e)
		{
			System.out.println("The username "+id+" or the password "+pw+" is invalid. Login Unsuccessful");
		}*/
	}
	
	@AfterMethod
	public void teardown()
	{
		d.close();
	}
	
	@BeforeMethod
	public void openapplication() throws IOException
	{
		//Driver initialization 
		d = initializeDriver();
				
		//Open the application url
		d.get(prop.getProperty("url"));
				
	}
	
	@DataProvider
	public Object[][] getCredentials()
	{
		Object [][] data = {{"arun.selenium@gmail.com","Second@123"},{"dummy@test.com","dummy"}};
		return data;
	}
}
