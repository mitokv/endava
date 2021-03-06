package lib.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistarionPage extends Page {
	
	private String married="Married";
	private String single="Single";
	private String divorced="Divorced";
	
	@FindBy(id="name_3_firstname")
	private WebElement firstName;
	
	@FindBy(id="name_3_lastname")
	private WebElement lastName;
	
	@FindBy(id="phone_9")
	private WebElement phoneNo;
	
	@FindBy(id="username")
	private WebElement userName;

	@FindBy(id="email_1")
	private WebElement email;
	
	@FindBy(id="description")
	private WebElement desc;
		
	@FindBy(id="password_2")
	private WebElement passwd;
	
	@FindBy(id="confirm_password_password_2")
	private WebElement repeatPass;
	
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[1]")
	private WebElement hobbyDancing;
	
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[1]")
	private WebElement hobbyReading;
	
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[1]")
	private WebElement hobbyCricket;
	
	@FindBy(id="dropdown_7")
	private WebElement selectcountry;
	
	@FindBy(xpath = "id('pie_register')/li[14]/div/input")
	private WebElement submitButton;
	
	@FindBy(xpath = "id('post-49')/div/p")
	private WebElement success;
	
	public RegistarionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void sendKeysToFirstNameInput(String firstname){
		firstName.sendKeys(firstname);
	}
	
	public void sendKeysToLastNameInput(String lastname){
		lastName.sendKeys(lastname);
	}
	
	public void sendKeysToPhoneInput(String phone){
		phoneNo.sendKeys(phone);
	}
	
	public void sendKeysToUsernameInput(String username){
		userName.sendKeys(username);
	}
	
	public void sendKeysToEmailInput(String imejl){
		email.sendKeys(imejl);
	}
	
	public void sendKeysToDescriptionInput(String description){
		desc.sendKeys(description);
	}
	
	public void sendKeysToPasswordInput(String pass){
		passwd.sendKeys(pass);
	}
	
	public void sendKeysToRepeatPasswordInput(String repeatpass){
		repeatPass.sendKeys(repeatpass);
	}
	
	public void selectMatitalStatus(String maritalStatus){
		List<WebElement> listOfInputs = _driver.findElements(By.xpath("id('pie_register')/li[2]/div/div/input"));
				if(maritalStatus.equalsIgnoreCase(this.single)){
					listOfInputs.get(0).click();
				}
				if(maritalStatus.equalsIgnoreCase(this.married)){
					listOfInputs.get(1).click();
				}
				else{
					listOfInputs.get(2).click();
				}
				
	}
	
	public void selectCheckboxHobbyReading(boolean bValue){
		if(bValue != hobbyReading.isSelected()){
			hobbyReading.click();
		};
	}
	
	public void selectCheckboxHobbyDancing(boolean bValue){
		if(bValue != hobbyDancing.isSelected()){
			hobbyReading.click();
		};
	}
	
	public void selectCheckboxHobbyCricket(boolean bValue){
		if(bValue != hobbyCricket.isSelected()){
			hobbyReading.click();
		};
	}
	public void seolectCountry(String country){
		Select select = new Select(selectcountry);
		select.selectByValue(country);
	}
	
	public void clickOnSubmitButton(){
		submitButton.click();
	}
	
	public boolean isDisplayedSuccessRegMsg(){
		try{
			return success.isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
		
	}
	
}
