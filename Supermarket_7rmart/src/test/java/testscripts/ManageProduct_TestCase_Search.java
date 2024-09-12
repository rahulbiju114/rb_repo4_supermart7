package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage_Page;
import pages.ManageProduct_Page;

public class ManageProduct_TestCase_Search extends BaseClass {

	public LoginPage_Page login;
	public ManageProduct_Page mp1;

	@Test
	public void enterValues() {

		String uA1 = "admin";
		String pA1 = "admin";

		String title3 = "Hi";

		String proCode3 = "Veg";

		login = new LoginPage_Page(driver);
		mp1 = login.enterUsname(uA1).enterPass(pA1).getClicked().getClickedLocate().getClicked_SearchButton()
				.enterProductCode(title3).enterProductCode(proCode3).clickCategory().clickSubCategory()
				.clickSearchButton().scrollDown1().clickCategory();

		boolean isSearchAssert1 = mp1.isSerachAssert();
		assertTrue(isSearchAssert1, "Search not happened");

	}

}
