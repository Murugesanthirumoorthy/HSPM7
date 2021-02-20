package HSPM.Admin.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import HSPM.Base.basetest;
import HSPM.Page.loginpage;

public class loginTestcase extends basetest {
	loginpage pageobj;
	
	public loginTestcase() 
	{
		super();
		
	}
@BeforeMethod
public void startup() {
	setup();
	pageobj =new loginpage();
	
}
@Test(priority=1)
public void checkpagetitle() {
	String actual=pageobj.verifytitle();
	String expe="Smart Hospital : Hospital Management System";
	Assert.assertEquals(expe,actual);
}
@Test(priority=2)
public void checklogo()
{
	Assert.assertTrue(pageobj.verifylogo());
}
@Test(priority=3)
public void applogin()
{
	pageobj.logintest(prop.getProperty("username"), prop.getProperty("password"));
}
@AfterClass
public void tearDown() 
{
	driver.quit();
}

}
