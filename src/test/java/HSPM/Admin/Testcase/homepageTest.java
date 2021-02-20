package HSPM.Admin.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HSPM.Base.basetest;
import HSPM.Page.Homepage;
import HSPM.Page.loginpage;

public class homepageTest extends basetest {
	Homepage objhmpg;
	loginpage pageobj;
	
	
	public homepageTest()
	{
		super();
		
		
	}
	@BeforeMethod
	public void launch()
	{
		setup();
		pageobj = new loginpage();
		pageobj.logintest(prop.getProperty("username"), prop.getProperty("password"));
		objhmpg = new Homepage();
		}
	@Test
	public void FrontofficeButton()
	{
		objhmpg.FrontOfficeButton();
	}

}
