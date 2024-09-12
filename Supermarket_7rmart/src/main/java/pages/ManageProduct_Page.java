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

	public void getClickedLocate() {
		wait.until(ExpectedConditions.elementToBeClickable(mp1));

		mp1.click();

	}

	@FindBy(xpath = "//i[@class='fas fa-trash-alt']")
	WebElement delete1;

	public void getClickedDelete() {
		delete1.click();
		driver.switchTo().alert().accept();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement delete2;

	public boolean isDeleteAlert() {

		return delete2.isDisplayed();
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search1;

	public void getClicked_SearchButton() {
		search1.click();

	}

	@FindBy(xpath = "//input[@name='un']")
	WebElement title1;

	public void enterTitle(String title2) {

		title1.sendKeys(title2);

	}

	@FindBy(xpath = "//input[@name='cd']")
	WebElement proCode1;

	public void enterProductCode(String proCode2) {

		proCode1.sendKeys(proCode2);
	}

	@FindBy(xpath = "//option[@value='257']")
	WebElement category1;

	public void clickCategory() {

		category1.click();
		;
	}

	@FindBy(xpath = "//select[@id='sb']")
	WebElement subCategory1;
	Select s1 = new Select(subCategory1);

	public void clickSubCategory() {

		s1.selectByIndex(2);
	}

	@FindBy(xpath = "//button[@value='sr']")
	WebElement srchBut1;

	public void clickSearchButton() {

		srchBut1.click();
		;
	}

	@FindBy(xpath = "//center[text()='.........RESULT NOT FOUND.......']")
	WebElement serchAssert;

	public boolean isSerachAssert() {

		return serchAssert.isDisplayed();
	}

	public void scrollDown1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");
	}

}
