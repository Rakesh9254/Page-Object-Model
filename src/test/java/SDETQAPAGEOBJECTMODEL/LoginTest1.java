package SDETQAPAGEOBJECTMODEL;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest1 {

	WebDriver driver;

	// constuctor
	LoginTest1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement UsernameTextField;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement UsernamepwdField;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement clickonBtn;

	// Action Methods

	public void EnterUserName(String Uname) {
		UsernameTextField.sendKeys(Uname);

	}

	public void Enterpassword(String pwd) {
		UsernamepwdField.sendKeys(pwd);

	}

	public void ClickOnsubmit() {
		clickonBtn.click();

	}

}
