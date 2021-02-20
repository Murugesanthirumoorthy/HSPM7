package HSPM.Util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import HSPM.Base.basetest;

public class commonutil extends basetest {
	public static void upload(String HSPM)
	{
	  
	  try {
	    Runtime.getRuntime().exec("./src/test/resources/HSPMT.exe"+" "+HSPM);
	    Thread.sleep(8000);
	  } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	  } catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	  }
	}

	//script for mouse click
	public static void mouseclick(WebElement el)
	{
	  Actions action=new Actions(driver);
	  action.click(el).build().perform();
	}
	public static void takescreenshot()
	{
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String currentDir = System.getProperty("user.dir");
	  File destination=new File(currentDir+"./Screenshot/"+System.currentTimeMillis()+".png");
	  try {
	    FileHandler.copy(scrFile,destination );
	  } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	  }
	}
}
