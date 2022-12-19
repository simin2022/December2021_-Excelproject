package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddcontactPage;
import page.DashBoardpage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddcontactTest {
	WebDriver driver;

	ExcelReader exlread = new ExcelReader("/excel/src/main/java/testData/excelreaderproject.xls");
	String username = exlread.getCellData("Logintestpage", "username", 2);
	String password = exlread.getCellData("Logintestpage", "password", 2);
	String dashboaerdHeader = exlread.getCellData(sheetName, colName, rowNum);
	String fullname = exlread.getCellData(sheetName, colName, rowNum);
	
	String companyname = exlread.getCellData(sheetName, colName, rowNum);
	String email = exlread.getCellData(sheetName, colName, rowNum);
	String phone = exlread.getCellData(sheetName, colName, rowNum);
	String address = exlread.getCellData(sheetName, colName, rowNum);
	String city = exlread.getCellData(sheetName, colName, rowNum);
	String country = exlread.getCellData(sheetName, colName, rowNum);
	String copy = exlread.getCellData(sheetName, colName, rowNum);
	String zipcode = exlread.getCellData(sheetName, colName, rowNum);

	public void validUserShouldBeAbletoAddCustomer() {
		driver = BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUsername(username);
		loginpage.insertPassword(password);
		loginpage.clickSIgninButton();
		
		DashBoardpage dashboardpage= PageFactory.initElements(driver, DashBoardpage.class);
		dashboardpage.validateDashboardpage(dashboaerdHeader);
		dashboardpage.customerMenuButton();
		dashboardpage.addCustomerButton();
		
		AddcontactPage addcontactpage= PageFactory.initElements(driver, AddcontactPage.class);
		addcontactpage.validateAddcontactPage("Add Contact");
		addcontactpage.insertfullNameButton(fullname);
		addcontactpage.selectCompanyName(companyname);
		addcontactpage.insertemailaddress(email);
		addcontactpage.insertPhoneNumber(phone);
		addcontactpage.insertaddress(address);
		addcontactpage.inserCity(city);
		addcontactpage.insertState(statename);
		addcontactpage.insertZipcode(zipcode);
		addcontactpage.selectCountry(country);
		addcontactpage.clickSaveButton();
	}

}