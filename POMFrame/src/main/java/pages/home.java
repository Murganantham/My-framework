package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class home  extends  Base {
	
	@FindBy(xpath="//a[@class='icon-Profile icon--xs ct-white']")
	WebElement profileicon;
	
	@FindBy(xpath="//a[@href='https://pro.reviewrev.com/authentication/logout.aspx?projectid=e8d802fd-511f-4622-8491-d3895a08dc73']")
	WebElement Logout;
	
	
	public home() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void homepage() {
		
		Actions A = new Actions(driver);
		A.moveToElement(profileicon).build().perform();
		Logout.click();
		
		
	}
	
	

}
