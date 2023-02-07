package TestClassPackage3;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassPackage2.baseclass;

public class TC_01_VerifyLoginPage extends baseclass
{
	
	
	@Test
	public void verifylogin() throws IOException
	{
		// apply validation using the assertion.
		
		String ExpectedTitle = "Swag Labs";
		
		String ActualTitle = new String(driver.getTitle());
		
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		UtilityClassPackage4.ScreenshotClass.GetScreenshot(driver, ActualTitle);
			
	}
	
	
	
	
}
