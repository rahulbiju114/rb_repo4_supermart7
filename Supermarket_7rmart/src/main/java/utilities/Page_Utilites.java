package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page_Utilites {
	WebDriver driver;

	public void subDropDown(WebElement indexWebElement) {

		Select s1 = new Select(indexWebElement);
		s1.selectByIndex(3);

	}

	public void scrollDown1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}

	public void scrollDownX280Y280() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(280,280)");
	}

	public void scrollDownX300Y300() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(300,300)");
	}

	public void scrollDownX380Y380() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(380,380)");
	}

	public void scrollDownX893Y61() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(893,61)");
	}

}
