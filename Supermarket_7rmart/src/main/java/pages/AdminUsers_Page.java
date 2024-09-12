package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUsers_Page {

	public WebDriver driver;

	public AdminUsers_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement locateAdminUser1;

	public AdminUsers_Page clickAdminUser() {

		locateAdminUser1.click();
		return this;
	}

	@FindBy(xpath = "(//i[@class='fas fa-trash-alt'])[1]")
	WebElement delete1;

	public AdminUsers_Page deleteAdminUser() {

		delete1.click();
		driver.switchTo().alert().accept();
		return new AdminUsers_Page(driver);

	}

	@FindBy(xpath = "(//i[@class='fa fa-unlock'])[1]")
	WebElement active1;

	public Category_Page clickActiveButton() {

		active1.click();
		return new Category_Page(driver);

	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[3]")
	WebElement locateCategory1;

	public Category_Page clickCategory() {

		locateCategory1.click();
		return new Category_Page(driver);
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert1;

	public boolean isAlertDisplayed() {

		return alert1.isDisplayed();
	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[4]")
	WebElement locateSubCategory1;

	public SubCategory_Page clickSubCategory() {

		locateSubCategory1.click();
		return new SubCategory_Page(driver);
	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[8]")
	WebElement mp1;

	public ManageProduct_Page getClickedLocate() {

		mp1.click();
		return new ManageProduct_Page(driver);

	}

}
