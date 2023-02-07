package UtilityClassPackage4;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
	
	public static void GetScreenshot(WebDriver driver,String screenshotname) throws IOException
	{
		Date d = new Date();
		
		DateFormat d1= new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		
		String date=d1.format(d);
		
		
		File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./Screenshots/SauceDemoProject" + screenshotname + date + ".jpg");
		
		FileHandler.copy(source, destination);
		
		
		
		
	}
	
	
}
