package test.registration;

import org.testng.annotations.Test;

import lib.data.Properties;
import lib.pages.Homepage;
import lib.pages.RegistarionPage;
import lib.util.Browser;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RegTest {
	WebDriver driver;
	RegistarionPage regPage;
	Homepage homePage;
	//http://demoqa.com/registration/
	
	  @BeforeClass
	  public void beforeClass() {
		  driver = Browser.openBrowser(Properties.URL);
	  }
  @Test
  public void f() {
	  homePage = new Homepage (driver);
	  regPage = homePage.clickOnRegistartionLink();
	  
	  regPage.sendKeysToFirstNameInput("Pera");
	  regPage.sendKeysToLastNameInput("Perkanovic");
	  regPage.sendKeysToUsernameInput("Perkan11");
	  
	  regPage.selectMatitalStatus("divourced");
	  regPage.selectCheckboxHobbyDancing(true);
	  
	  regPage.seolectCountry("Laos");
	  
	  regPage.sendKeysToPhoneInput("0035332546468");
	  regPage.sendKeysToEmailInput("dzoniub@gmail.com");
	  regPage.sendKeysToPasswordInput("nesto123nesto");
	  regPage.sendKeysToRepeatPasswordInput("nesto123nesto");
	  
	  Sleeper.sleepTightInSeconds(4);
	  
	  regPage.clickOnSubmitButton();
	  Sleeper.sleepTightInSeconds(4);
	  
	  Assert.assertEquals(regPage.isDisplayedSuccessRegMsg(), true);
	
  }


  @AfterClass
  public void afterClass() {
  }

}
