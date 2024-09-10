package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Wait_Utilities;

public class Category_Page {

	public WebDriver driver;

	public Category_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[3]")
	WebElement locateCategory1;

	public Category_Page clickCategory() {

		locateCategory1.click();
		return this;
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement new1;

	public Category_Page clickNew() {

		new1.click();
		return this;
	}

	@FindBy(xpath = "//input[@placeholder='Enter the Category']")
	WebElement name1;

	public Category_Page enterName(String categoryFiled) {

		name1.sendKeys(categoryFiled);
		return this;
	}

	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement group1;

	public Category_Page clickGroup() {

		group1.click();
		return this;
	}

	@FindBy(xpath = "//input[@name='main_img']")
	WebElement image1;

	public Category_Page chooseImage() {

		image1.sendKeys("C:\\Users\\rahul\\Desktop\\img1.jpg");
		return this;

	}

	Wait_Utilities wt = new Wait_Utilities();
	@FindBy(xpath = "//button[@name='create']")
	WebElement save1;

	public SubCategory_Page clickSave() {

		save1.click();
		wt.waitforCategory(save1);
		return new SubCategory_Page(driver);

	}

	public void pageScrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert1;

	public boolean isAlertDisplayed() {

		return alert1.isDisplayed();
	}

}
