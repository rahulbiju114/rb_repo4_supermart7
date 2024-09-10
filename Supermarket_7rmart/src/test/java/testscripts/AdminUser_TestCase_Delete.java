package testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import Constants.Constants;
import Pages.AdminUsers_Page;
import Pages.Category_Page;
import Pages.LoginPage_Page;
import Utilities.Exel_Utility;

public class AdminUser_TestCase_Delete extends BaseClass {
	
	public LoginPage_Page login;
	public AdminUsers_Page admin;
	public Category_Page cat;
	
	@Test(priority = 1, retryAnalyzer = retry.Retry.class)
	public void enterValues() throws IOException {

		String uA1 = Exel_Utility.getStringData(1, 0, "Login1");
		String pA1 = Exel_Utility.getStringData(1, 1, "Login1");

//		LoginPage_Page p1 = new LoginPage_Page(driver);
//		p1.enterUsname(uA1);
//		p1.enterPass(pA1);
//		p1.getClicked();
		
		login = new LoginPage_Page(driver);
		admin = login.enterUsname(pA1).enterPass(uA1).getClicked();
		
		
//		AdminUsers_Page admin1 = new AdminUsers_Page(driver);
//		admin1.clickAdminUser();
//		admin1.deleteAdminUser();

		admin = new AdminUsers_Page(driver);
		cat = admin.clickAdminUser().deleteAdminUser();
		
		boolean isAlert = admin.isAlertDisplayed();
		assertTrue(isAlert, Constants.ERRORFORADMINUSERALERTDELETE);

	}
}
