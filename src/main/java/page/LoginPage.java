package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public void loginpage (WebDriver driver) {
		this.driver= driver;
		}
	//Element list
		@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
		WebElement USER_NAME_FIELD;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
		WebElement PASSWORD_FIELD;
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
		WebElement SIGNIN_BUTTON;
		
		//intractable methods

		public void insertUsername(String userName) {

			USER_NAME_FIELD.sendKeys(userName);
		}

		public void insertPassword(String passWord) {
			PASSWORD_FIELD.sendKeys(passWord);

		}

		public void clickSIgninButton() {
			SIGNIN_BUTTON.click();

		}
	}

