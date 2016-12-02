package test.drugi;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lib.pages.AboutUsPage;
import lib.pages.Homepage;
import lib.util.Browser;

public class DrugiTest {

	AboutUsPage aboutUsPage;
	Homepage homePage;
	WebDriver driver;
	//RegistartionPage registartionPage;
	
	
	@BeforeClass
	public void setUp(){
		driver = Browser.openBrowser("http://demoqa.com/");
	}
	
	@Test
	public void test(){
		try{
			homePage = new Homepage(driver);
			aboutUsPage = homePage.clickOnAboutUsLInk();
			
			
			Assert.assertEquals(aboutUsPage.isDisplayedAboutUsHeader(), true);
			Assert.assertEquals(aboutUsPage.getTextAboutUsHeader(), "about us");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
