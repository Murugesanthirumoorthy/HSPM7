package HSPM.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HSPM.Base.basetest;
import HSPM.Util.commonutil;

public class visitorpage extends basetest {
	HSPM.Util.Datepicker objdat=new HSPM.Util.Datepicker();
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(1) > a")WebElement FrontOffice;
	@FindBy(linkText="Visitor Book")WebElement VisitorBook;
	@FindBy(linkText="Add Visitor")WebElement AddVisitor;
	@FindBy(id="description")WebElement describe;
	@FindBy(css="#formadd > div.box-body > div:nth-child(1) > div:nth-child(1) > div > select")WebElement purpose;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[1]/div[2]/div/input")WebElement name;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[2]/div[1]/div/input")WebElement phone;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[2]/div[2]/div/input")WebElement ID;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[3]/div[1]/div/input")WebElement NOofPersons;
	@FindBy(id="date")WebElement Datepicker;
	@FindBy(css="#formadd > div.box-body > div:nth-child(6) > div > div > input")WebElement uploadbutton;
	public visitorpage()
	{
		PageFactory.initElements(driver, this);
	}
	public void visitioraddButton()
	{
		
		
		AddVisitor.click();
		Select drop=new Select(purpose);
		drop.selectByValue("investigate");
		describe.sendKeys("Fever");
		name.sendKeys("Murugesan");
		phone.sendKeys("9025230107");
		ID.sendKeys("100325");
		NOofPersons.sendKeys("Two");
		Datepicker.click();
		objdat.datpicker("7/05/2015");
		uploadbutton.click();
		
		String currentfile =(System.getProperty("user.dir"));
		String fileupload= currentfile+"./src/test/resources/HSPM.xlsx";
		commonutil.mouseclick(uploadbutton);
		commonutil.upload(fileupload);

		
	} 
	 }

