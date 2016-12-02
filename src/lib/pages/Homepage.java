package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Page{

	@FindBy(id= "ui-id-1")
	private WebElement tab1;
	
	public Homepage(WebDriver driver) {
		super(driver);
		
		System.out.println("open homepage ok.......");
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnTab1(){
		tab1.click();
	}

	
	
	
}
