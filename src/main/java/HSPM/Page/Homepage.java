package HSPM.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HSPM.Base.basetest;

public class Homepage extends basetest {
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(1) > a")WebElement FrontOffice;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(2) > a")WebElement OutPatient;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(3) > a")WebElement InPatient;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(4) > a")WebElement Pharamacy;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(5) > a")WebElement Pathology;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(6) > a")WebElement Radiology;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(7) > a")WebElement Operation_Theatre;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(8) > a")WebElement BloodBank;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(9) > a")WebElement TAPManagement;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(10) > a")WebElement Finance;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(11) > a")WebElement Ambulance;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(12) > a")WebElement HumanResource;
	@FindBy(css="ul.sidebar-menu.verttop > li:nth-child(13) > a")WebElement Messaging;
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	public FrontOfficepage FrontOfficeButton()
	{
		FrontOffice.click();
	/*	OutPatient.click();
		InPatient.click();
		Pharamacy.click();
		Pathology.click();
		Radiology.click();
		Operation_Theatre.click();
		BloodBank.click();
		TAPManagement.click();
		Finance.click();
		Ambulance.click();
		HumanResource.click();
		Messaging.click();   */
		return new FrontOfficepage();
	}
}
