package POMClassPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLogoutPOM 
{

	
		//1.
		
		WebDriver driver;
		
		//2.
		
		@FindBy(xpath ="//a[contains(text(),'Logout')]") WebElement logoutbutton;
		public void logout()
		{
			logoutbutton.click();
		}
		
		//3.
		
		public SauceDemoLogoutPOM(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		

	

}
