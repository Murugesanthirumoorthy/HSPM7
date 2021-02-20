package HSPM.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HSPM.Base.basetest;

public class FrontOfficepage extends basetest {
	
	@FindBy(linkText="Visitor Book")WebElement VisitorBook;
	public FrontOfficepage() {
		PageFactory.initElements(driver, this);
	}
	public visitorpage VisitorBook()
	{
	
		VisitorBook.click();
		return new visitorpage();
	}
}
