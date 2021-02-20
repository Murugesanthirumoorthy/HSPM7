package HSPM.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import HSPM.Util.WebEventListener;



public class basetest {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	  public static WebEventListener webel;
	
	public basetest() 
	{
		prop=new Properties();
		try {
			FileInputStream inpfconfg=new FileInputStream(System.getProperty("user.dir")+"./src/main/java/HSPM/Config/test.properties");
			prop.load(inpfconfg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setup() 
	{
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		//basic method
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		//Firing event 
	    e_driver=new EventFiringWebDriver(driver);
	    webel=new WebEventListener();
	    e_driver.register(webel);
	    driver=e_driver;
	}

}
