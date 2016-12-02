package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	protected WebDriver _driver;
	
	
	@FindBy( id = "menu-item-158")
	private WebElement aboutUsLink;
	
	@FindBy(xpath = "id('menu-item-155')")
	private WebElement serviceLink;
	
	@FindBy(xpath = "id('menu-item-374')")
	private WebElement registarionLink;
	
	public Page(WebDriver driver){
		this._driver = driver;
		PageFactory.initElements(_driver, this);
	}
	
	public RegistarionPage clickOnRegistartionLink(){

		registarionLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new RegistarionPage(_driver);
	}
	
	
	public AboutUsPage clickOnAboutUsLInk(){
		aboutUsLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new AboutUsPage(_driver);
	}
}
