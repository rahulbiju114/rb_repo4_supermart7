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

	public void clickCategory() {

		locateCategory1.click();
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement new1;

	public void clickNew() {

		new1.click();
	}

	@FindBy(xpath = "//input[@placeholder='Enter the Category']")
	WebElement name1;

	public void enterName(String categoryFiled) {

		name1.sendKeys(categoryFiled);
	}

	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement group1;

	public void clickGroup() {

		group1.click();
	}

	@FindBy(xpath = "//input[@name='main_img']")
	WebElement image1;

	public void chooseImage() {

		image1.sendKeys("C:\\Users\\rahul\\Desktop\\img1.jpg");

	}

	Wait_Utilities wt = new Wait_Utilities();
	@FindBy(xpath = "//button[@name='create']")
	WebElement save1;

	public void clickSave() {

		save1.click();
		wt.waitforCategory(save1);

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
