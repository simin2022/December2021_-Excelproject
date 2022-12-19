package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import page.DashBoardpage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

@Test
public class LoginTest {
	WebDriver driver;

	ExcelReader exlread = new ExcelReader("/excel/src/main/java/testData/excelreaderproject.xls");
	String username = exlread.getCellData("Logintestpage", "username", 2);
	String password = exlread.getCellData("Logintestpage", "password", 2);
String dashboaerdHeader= exlread.getCellData(sheetName, colName, rowNum)
	public void validUserShouldBeAbleToLogIn() {

		driver = BrowserFactory.init();

		// To bring the Driver from a class we need to use PageFactory to create an
		// object with in this class.
		// Object needs to be created since its a different package.
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUsername(username);
		loginpage.insertPassword(password);
		loginpage.clickSIgninButton();

		// DashBoardpage dashboardpage= PageFactory.initElements(driver,
		// DashBoardpage.class);
		// dashboardpage.validateDashboardpage("Dashboard");
		// dashboardpage.customerMenuButton();
		// dashboardpage.addCustomerButton();;
		BrowserFactory.tearDown();
	}

}
