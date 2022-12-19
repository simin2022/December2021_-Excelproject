package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddcontactPage extends BasePage {
	WebDriver driver;

	// this method has been created to evoke the constructor so we can use the same
	// WebDriver driver for different class in a different package.
	public void AddcontactPage(WebDriver driver) {

		this.driver = driver;
	}
      @FindBy(how=How.XPATH,using="//h5[contains(text(), 'Add Contact')]")WebElement Add_Contact_Header_Element;
      @FindBy(how=How.XPATH,using="//input[@id='account']")WebElement Full_Name_Element;
      @FindBy(how=How.XPATH,using="//select[@id='cid']")WebElement Company_Element;
     @FindBy(how=How.XPATH,using="//*[@id='email']")WebElement Email_Address_Element;
     @FindBy(how=How.XPATH,using="//*[@id=\"rform\"]/div[1]/div[1]/div[4]/label")WebElement PHONE_NUMBER_Element;
     @FindBy(how=How.XPATH,using="//*[@id=\"rform\"]/div[1]/div[1]/div[5]/label']")WebElement ADDRESS_ELEMENT;
     @FindBy(how=How.XPATH,using="//*[@id=\"rform\"]/div[1]/div[1]/div[6]/label")WebElement CITY_Element;
     @FindBy(how= How.XPATH,using= "//*[@id=\"rform\"]/div[1]/div[1]/div[7]/label")WebElement STATE_ELEMENT;
     @FindBy(how=How.XPATH,using="//*[@id=\"rform\"]/div[1]/div[1]/div[8]/label")WebElement ZIPCODE_Element;
     @FindBy(how= How.XPATH,using="//*[@id=\"rform\"]/div[1]/div[1]/div[9]/label")WebElement COUNTRY_ELEMENT;
     @FindBy(how= How.XPATH,using="//*[@id=\"submit\"]")WebElement SAVE_ELEMENT;
     
      
      public void validateAddcontactPage(String addContact) {
    	 //use WebDriverWait here.
    	  
    	  Assert.assertEquals(Add_Contact_Header_Element.getText(), addContact, "Wrong page");
      }
 public void insertfullNameButton(String fullname) {
    	  
	 Full_Name_Element.sendKeys(fullname + generatedRandomNo(999));
      }
 public void selectCompanyName(String company) {
	selectFromDropdown(Company_Element, company);
	 
 }
 public void insertemailaddress(String email) {
	 Email_Address_Element.sendKeys(generatedRandomNo(999)+ email);	 
	 }
 public void insertPhoneNumber(String phone) {
	PHONE_NUMBER_Element.sendKeys(phone + generatedRandomNo(999)); 
	 }
 public void insertaddress(String address) {
	 ADDRESS_ELEMENT.sendKeys(address);
		 }
 public void inserCity(String city) {
	 CITY_Element.sendKeys(city);
		 }
 public void insertState(String state) {
	 STATE_ELEMENT.sendKeys(state);;
		 }
 public void insertZipcode(String zipcode) {
	 ZIPCODE_Element.sendKeys(zipcode);
		 }
 public void selectCountry(String country) {
	 selectFromDropdown(COUNTRY_ELEMENT, country);
		 }
 public void clickSaveButton(String save) {
	SAVE_ELEMENT.click();
		 }
}

