package SDETQAPAGEOBJECTMODEL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
@Test
	public void TestLogin() {
	LoginTest1 loginPage = new LoginTest1
			(driver);
		loginPage.EnterUserName("Admin");
		loginPage.Enterpassword("admin123");
		loginPage.ClickOnsubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}
@Test
public void TestLogin2() {
	LoginTest1 loginPage = new LoginTest1
			(driver);
		loginPage.EnterUserName("Admin");
		loginPage.Enterpassword("admin123");
		loginPage.ClickOnsubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}


	@AfterMethod
	void tearDown() {
		driver.quit();
	}

}
