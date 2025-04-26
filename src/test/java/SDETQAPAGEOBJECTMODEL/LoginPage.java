package SDETQAPAGEOBJECTMODEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	// Constrctor
	LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// locators
	By Username = By.xpath("//input[@placeholder='Username']");

	By password = By.xpath("//input[@placeholder='Password']");

	By submit = By.xpath("//button[normalize-space()='Login']");

	// Action

	public void EnterUserName(String Uname) {
		driver.findElement(Username).sendKeys(Uname);

	}

	public void Enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);

	}

	public void ClickOnsubmit() {
		driver.findElement(submit).click();

	}

}
