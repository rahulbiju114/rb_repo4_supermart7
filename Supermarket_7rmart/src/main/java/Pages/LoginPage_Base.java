package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Base {

	public WebDriver driver;

	public LoginPage_Base(WebDriver driver) { 

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

}
