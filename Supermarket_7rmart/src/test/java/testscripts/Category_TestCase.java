package testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Category_Page;
import pages.LoginPage_Page;
import pages.SubCategory_Page;
import utilities.Exel_Utility;

public class Category_TestCase extends BaseClass {
	public LoginPage_Page login;
	public Category_Page cat;
	public SubCategory_Page sub;

	@Test
	public void enterValues() throws IOException {

	String uA1 = Exel_Utility.getStringData(1, 0, "Login1");
	String pA1 = Exel_Utility.getStringData(1, 1, "Login1");

	
	String catField = Exel_Utility.getStringData2(1, 1, "Sheet1");
		
		login = new LoginPage_Page(driver);
		cat = login.enterUsname(pA1).enterPass(uA1).getClicked().clickCategory().clickNew().enterName(catField).clickGroup().chooseImage();		
		sub = cat.clickSave();

		boolean isAlert = cat.isAlertDisplayed();
		assertTrue(isAlert, Constants.ERRORFORCATEGORYALERT);
		System.out.println(Constants.ERRORFORCATEGORYALERT);

	}
}
