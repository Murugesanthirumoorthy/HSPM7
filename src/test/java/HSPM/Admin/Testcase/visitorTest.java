package HSPM.Admin.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HSPM.Base.basetest;
import HSPM.Page.FrontOfficepage;
import HSPM.Page.Homepage;
import HSPM.Page.loginpage;
import HSPM.Page.visitorpage;

public class visitorTest extends basetest {
	visitorpage vobj;
	loginpage pageobj;
	FrontOfficepage frontobj;
	Homepage objhmpg;
	
	public visitorTest()
	{
		super();
	}
	@BeforeMethod
	public void launch()
	{
		setup();
		pageobj = new loginpage();
		objhmpg=pageobj.logintest(prop.getProperty("username"), prop.getProperty("password"));
		frontobj=objhmpg.FrontOfficeButton();
		vobj=frontobj.VisitorBook();		
		
		
	}
	
@Test
public void VBbutton() {
	vobj.visitioraddButton();
}
}
