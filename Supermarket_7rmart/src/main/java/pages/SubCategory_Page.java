package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Page_Utilites;

public class SubCategory_Page {

	public WebDriver driver;

	public SubCategory_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[4]")
	WebElement locateSubCategory1;

	public SubCategory_Page clickSubCategory() {

		locateSubCategory1.click();
		return this;
	}

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement locateNewButton;

	public SubCategory_Page clickNewButton() {

		locateNewButton.click();
		return this;
	}

	@FindBy(xpath = "//select[@id='cat_id']")
	WebElement clickDropDown1;

	public SubCategory_Page clickDropDownSub() {

		Page_Utilites page1 = new Page_Utilites();
		page1.subDropDown(clickDropDown1);
		return this;
	}

	@FindBy(xpath = "//input[@id='subcategory']")
	WebElement enterSubCat1;

	public SubCategory_Page enterSubCat(String subCategoryFiled) {

		enterSubCat1.sendKeys(subCategoryFiled);
		return this;
	}

	@FindBy(xpath = "//input[@name='main_img']")
	WebElement image1;

	public SubCategory_Page chooseImage() {

		image1.sendKeys("C:\\Users\\rahul\\Desktop\\Obsqura\\Selenium\\images\\img1.jpg");
		return this;
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement save1;

	public ManageProduct_Page saveButton() {

		save1.click();
		return new ManageProduct_Page(driver);
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert1;

	public boolean isAlertDisplayed() {

		return alert1.isDisplayed();
	}

}
