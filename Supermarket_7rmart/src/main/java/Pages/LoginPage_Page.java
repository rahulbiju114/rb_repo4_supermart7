package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Page {

	public WebDriver driver;

	public LoginPage_Page(WebDriver driver) { // constructor

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usname1;

	public void enterUsname(String usnameA) {

		usname1.sendKeys(usnameA);
	}

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pass1;

	public void enterPass(String passA) {

		pass1.sendKeys(passA);
	}

	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement button1;

	public void getClicked() {

		button1.click();

	}

	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dash1;

	public boolean isDashboardDisplayed() {

		return dash1.isDisplayed();
	}

	@FindBy(xpath = "//i[@class='icon fas fa-ban']")
	WebElement alert1;

	public boolean isAlertDisp() {

		return alert1.isDisplayed();
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin1;

	public void getAdminClicked() {

		admin1.click();
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")
	WebElement logout1;

	public void getLogoutClicked() {

		logout1.click();
	}

	@FindBy(xpath = "//div[@class='login-box']")
	WebElement logIn1;

	public boolean isLogoutLogindDisplayed() {

		return logIn1.isDisplayed();
	}

}
