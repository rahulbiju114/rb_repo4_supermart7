package testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUsers_Page;
import pages.Category_Page;
import pages.LoginPage_Page;
import utilities.Exel_Utility;

public class AdminUser_TestCase_ActiveButton extends BaseClass {

	public LoginPage_Page login;
	public AdminUsers_Page admin;
	public Category_Page cat;

	@Test(groups = { "Smoke" })
	public void enterValues() throws IOException {

		String uA1 = Exel_Utility.getStringData(1, 0, "Login1");
		String pA1 = Exel_Utility.getStringData(1, 1, "Login1");

		login = new LoginPage_Page(driver);
		admin = login.enterUsname(pA1).enterPass(uA1).getClicked();
		cat = admin.clickAdminUser().clickActiveButton();

		boolean isAlert = admin.isAlertDisplayed();
		assertTrue(isAlert, Constants.ERRORFORADMINUSERALERTACTIVE);
	}
}
