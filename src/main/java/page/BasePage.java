package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;

	// this method has been created to evoke the constructor so we can use the same
	// WebDriver driver for different class in a different package.

	public void selectFromDropdown(WebElement element, String variables) {

		Select sel = new Select(element);
		sel.selectByVisibleText(variables);
	}

	public int generatedRandomNo(int boundaryNo) {
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNo);
		return generatedNo;
	}
}
