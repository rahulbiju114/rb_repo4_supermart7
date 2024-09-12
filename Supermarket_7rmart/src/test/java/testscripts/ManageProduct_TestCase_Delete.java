package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage_Page;
import pages.ManageProduct_Page;

public class ManageProduct_TestCase_Delete extends BaseClass {
	
	public LoginPage_Page login;
	public ManageProduct_Page mp1;

	@Test
	public void enterValues() {

		String uA1 = "admin";
		String pA1 = "admin";

		login = new LoginPage_Page(driver);
		mp1 = login.enterUsname(uA1).enterPass(pA1).getClicked().getClickedLocate().getClickedDelete();

		boolean isDeleteAlert1 = mp1.isDeleteAlert();
		assertTrue(isDeleteAlert1, "Alert not loaded");

	}
}
