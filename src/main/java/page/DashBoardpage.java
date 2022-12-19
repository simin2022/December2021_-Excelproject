package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DashBoardpage {
	WebDriver driver;

	// this method has been created to evoke the constructor so we can use the same
	// WebDriver driver for different class in a different package.
	public void dashboardPage(WebDriver driver) {

		this.driver = driver;
	}

	// element list
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Dashboard ')]")
	WebElement DashBoard_Header_Element;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]")
	WebElement Customers_Menu_Element;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")
	WebElement Add_Customers_Element;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'List Customers')]")
	WebElement LIST_Customers_Element;

	public void validateDashboardpage(String Dashboard) {
		Assert.assertEquals(DashBoard_Header_Element.getText(), Dashboard, "Wrong page");
	}

	public void customerMenuButton() {
		Customers_Menu_Element.click();

	}

	public void addCustomerButton() {
		Add_Customers_Element.click();

	}
}
