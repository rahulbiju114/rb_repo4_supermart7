package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageProduct_Page {

	public WebDriver driver;

	public ManageProduct_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(xpath = "(//a[@class='small-box-footer'])[8]")
	WebElement mp1;

	public ManageProduct_Page getClickedLocate() {
		wait.until(ExpectedConditions.elementToBeClickable(mp1));

		mp1.click();
		return this;

	}

	@FindBy(xpath = "(//a[@class='btn btn-sm btn btn-danger btncss'])[1]")
	WebElement delete1;

	public ManageProduct_Page getClickedDelete() {
		delete1.click();
		driver.switchTo().alert().accept();
		return new ManageProduct_Page(driver);
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement delete2;

	public boolean isDeleteAlert() {

		return delete2.isDisplayed();
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search1;

	public ManageProduct_Page getClicked_SearchButton() {
		search1.click();
		return this;

	}

	@FindBy(xpath = "//input[@name='un']")
	WebElement title1;

	public ManageProduct_Page enterTitle(String title2) {

		title1.sendKeys(title2);
		return this;

	}

	@FindBy(xpath = "//input[@name='cd']")
	WebElement proCode1;

	public ManageProduct_Page enterProductCode(String proCode2) {

		proCode1.sendKeys(proCode2);
		return this;
	}

	@FindBy(xpath = "//option[@value='257']")
	WebElement category1;

	public ManageProduct_Page clickCategory() {

		category1.click();
		return this;

	}

	@FindBy(xpath = "//select[@id='sb']")
	WebElement subCategory1;
	Select s1 = new Select(subCategory1);

	public ManageProduct_Page clickSubCategory() {

		s1.selectByIndex(2);
		return this;
	}

	@FindBy(xpath = "//button[@value='sr']")
	WebElement srchBut1;

	public ManageProduct_Page clickSearchButton() {

		srchBut1.click();
		return this;

	}

	@FindBy(xpath = "//center[text()='.........RESULT NOT FOUND.......']")
	WebElement serchAssert;

	public boolean isSerachAssert() {

		return serchAssert.isDisplayed();
	}

	public ManageProduct_Page scrollDown1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");
		return this;
	}

}
