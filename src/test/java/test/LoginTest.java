package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.LoginPage;
import page.MyAccountPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("agentofforce07@gmail.com");
		loginPage.enterPassword("12345");
		loginPage.pressLoginButton();
		
		MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
		myAccountPage.verifyMyAccountPage();

//		lp.testLogin("agentofforce07@gmail.com", "12345");
		
		BrowserFactory.tearDown();
	} 
	
	
}
