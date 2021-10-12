package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.MyAccountPage;
import page.YourPersonalInfoPage;
import util.BrowserFactory;

public class ChangeAccountInfoTest {

	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToChangeAccountInfo() throws InterruptedException {
		driver = BrowserFactory.init();
		
		LoginPage loginPage = 
				PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("agentofforce07@gmail.com");
		loginPage.enterPassword("12345");
		loginPage.pressLoginButton();
		
		MyAccountPage myAccountPage = 
				PageFactory.initElements(driver, MyAccountPage.class);
		myAccountPage.verifyMyAccountPage();
		myAccountPage.clickMyPersonalInfoButton();
		
		YourPersonalInfoPage yourPersonalInfoPage = 
				PageFactory.initElements(driver, YourPersonalInfoPage.class);
		yourPersonalInfoPage.enterFirstName("Frederick");
		yourPersonalInfoPage.enterLastName("Kemett");
		yourPersonalInfoPage.enterEmail("agentofforce07@gmail.com");
		yourPersonalInfoPage.enterDOB("15  ","August ","1998  ");
		Thread.sleep(2000);
		
		BrowserFactory.tearDown();
	}
	
}
