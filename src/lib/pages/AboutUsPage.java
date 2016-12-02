package lib.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends Page{

	@FindBy(xpath = "id('post-156')/header/h1")
	private WebElement aboutAsHeader;
	
	public AboutUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isDisplayedAboutUsHeader(){
		try{
			return aboutAsHeader.isDisplayed();
		}
		catch(NoSuchElementException e){
			return false;
		}
		
	}
	
	public String getTextAboutUsHeader(){
		return aboutAsHeader.getText();
	}

}
