package POMClassPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage 
{
	
	//1. 
	
	WebDriver driver;
	
	//2.
	
	@FindBy(xpath="//input[@id=\"user-name\"]") WebElement username;
	@FindBy(xpath="//input[@id=\"password\"]") WebElement password;
	@FindBy(xpath="//input[@id=\"login-button\"]") WebElement loginbutton;
	
	//3.
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickonloginbutton()
	{
		loginbutton.click();
	}
	
	
	//4.
	
	public SauceDemoLoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
}
