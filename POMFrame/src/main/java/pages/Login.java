package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class Login extends Base {

	@FindBy(id = "txtUsername")
	WebElement emailidfield;
	@FindBy(id = "txtPassword")
	WebElement Passwordfield;
	@FindBy(id = "btnLoginSubmit")
	WebElement loginbutton;

	public Login() {
		PageFactory.initElements(driver, this);
	}

	public void logpage() {		
		System.out.println("driver in Login page");
		emailidfield.sendKeys("patch@yopmail.com");
		Passwordfield.sendKeys("test");
		loginbutton.click();

	}

}
