package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	//WebDriver initialization
	WebDriver driver = null;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		//Loading the properties file
		prop = new Properties();
		String ppath = System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\resources\\\\data.properties";
		FileInputStream fis = new FileInputStream(ppath);
		prop.load(fis);
			
		
		//Verifying browser chosen and creating appropriate browser
		if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
			
		//Browser gets maximized and timeouts are declared
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
}
