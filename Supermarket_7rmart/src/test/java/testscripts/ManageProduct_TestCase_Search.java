package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.LoginPage_Base;
import Pages.ManageProduct_Page;

public class ManageProduct_TestCase_Search extends BaseClass {

	@Test
	public void enterValues() {

		String uA1 = "admin";
		String pA1 = "admin";

		LoginPage_Base p1 = new LoginPage_Base(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();

		ManageProduct_Page p2 = new ManageProduct_Page(driver);
		p2.getClickedLocate();
		p2.getClicked_SearchButton();

		String title3 = "Hi";
		p2.enterTitle(title3);

		String proCode3 = "Veg";
		p2.enterProductCode(proCode3);

		p2.clickCategory();
		p2.clickSubCategory();

		p2.clickSearchButton();

		p2.scrollDown1();

		boolean isSearchAssert1 = p2.isSerachAssert();
		assertTrue(isSearchAssert1, "Search not happened");

	}

}
