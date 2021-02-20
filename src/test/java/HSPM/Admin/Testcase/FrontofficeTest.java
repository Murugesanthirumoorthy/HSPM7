package HSPM.Admin.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HSPM.Base.basetest;
import HSPM.Page.FrontOfficepage;
import HSPM.Page.loginpage;
import HSPM.Page.visitorpage;

public class FrontofficeTest extends basetest {
	visitorpage vobj;
	loginpage pageobj;
	FrontOfficepage frontobj;

	public FrontofficeTest() {
		super();
	}
	@BeforeMethod
	public void launch() 
	{
		setup();
		pageobj = new loginpage();
		pageobj.logintest(prop.getProperty("username"), prop.getProperty("password"));
		frontobj = new FrontOfficepage();
	}
	@Test
	public void frontofficebutton()
	{
		frontobj.VisitorBook();
	}
}
