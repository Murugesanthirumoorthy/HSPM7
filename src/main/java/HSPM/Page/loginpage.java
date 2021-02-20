package HSPM.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HSPM.Base.basetest;

public class loginpage extends basetest {
	
	@FindBy(css="input#email")WebElement uname;
	@FindBy(css="input#password")WebElement upass;
	@FindBy(tagName="img")WebElement Hspmlogo;
	@FindBy(linkText="Forgot Password?")WebElement fpass;
	@FindBy(className="btn")WebElement lbttn;
	
	public loginpage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifytitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifylogo() 
	{
		return Hspmlogo.isDisplayed();
		
	}
	public Homepage logintest(String username,String Password)
	{
		uname.sendKeys(username);
		upass.sendKeys(Password);
		lbttn.click();
		return new Homepage();
	}
	}
