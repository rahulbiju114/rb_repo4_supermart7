package testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import Constants.Constants;
import Pages.Category_Page;
import Pages.LoginPage_Page;
import Utilities.Exel_Utility;

public class Category_TestCase extends BaseClass {

	@Test
	public void enterValues() throws IOException {

		String uA1 = Exel_Utility.getStringData(1, 0, "Login1");
		String pA1 = Exel_Utility.getStringData(1, 1, "Login1");

		LoginPage_Page p1 = new LoginPage_Page(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();

		Category_Page p2 = new Category_Page(driver);

		p2.clickCategory();
		p2.clickNew();

		String catField = Exel_Utility.getStringData2(1, 1, "Sheet1");
		p2.enterName(catField);

		p2.clickGroup();

		p2.clickSave();
		p2.pageScrolldown();

		boolean isAlert = p2.isAlertDisplayed();
		assertTrue(isAlert, Constants.ERRORFORCATEGORYALERT);
		System.out.println(Constants.ERRORFORCATEGORYALERT);

	}
}
