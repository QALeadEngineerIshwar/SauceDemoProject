package BaseClassPackage2;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POMClassPackage1.SauceDemoLoginPage;
import POMClassPackage1.SauceDemoLogoutPOM;

public class baseclass 
{
	//1. 
	
	Logger log=Logger.getLogger("SauceDemoProject");
	
	//2.
	public WebDriver driver;
	
	//3.@BeforeMethod tag with setup() method.
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Babarao Kishan Mise\\eclipse-workspace\\SauceDemoProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		PropertyConfigurator.configure("log4j.properties");       // put the file log4j.properties
		log.info("Browser is opened");
		
		driver.manage().window().maximize();					// window maximize
		log.info("window is maximized");
		
		driver.get("https://www.saucedemo.com/");               // URL is opened
		log.info("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);       // wait applied
		
		
		
		// 4. pom class instance or object is created.
		
		// first pom page instance
		SauceDemoLoginPage SDLP = new SauceDemoLoginPage(driver);
		
		SDLP.sendusername();
		log.info("username is entered");
		
		SDLP.sendpassword();
		log.info("password is entered");
		
		SDLP.clickonloginbutton();
		log.info("clicked on login button");
		
		
		// second pom page instance created.
		
		SauceDemoLogoutPOM SDLPOM = new SauceDemoLogoutPOM(driver);
		SDLPOM.logout();
		log.info("logged out from the application");
			
			
	}
	
	// 5.
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("quit from the browser");
	}
	
	
	
	
	
	

}
