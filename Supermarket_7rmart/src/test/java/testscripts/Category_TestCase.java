package testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUsers_Page;
import pages.Category_Page;
import pages.LoginPage_Page;
import pages.SubCategory_Page;
import utilities.Exel_Utility;

public class Category_TestCase extends BaseClass {
	public LoginPage_Page login;
	public AdminUsers_Page admin;
	public Category_Page cat;
	public SubCategory_Page sub;

	@Test
	public void enterValues() throws IOException {

	String uA1 = Exel_Utility.getStringData(1, 0, "Login1");
	String pA1 = Exel_Utility.getStringData(1, 1, "Login1");

//		LoginPage_Page p1 = new LoginPage_Page(driver);
//		p1.enterUsname(uA1);
//		p1.enterPass(pA1);
//		p1.getClicked();
	
	String catField = Exel_Utility.getStringData2(1, 1, "Sheet1");
		
		login = new LoginPage_Page(driver);
		cat = login.enterUsname(pA1).enterPass(uA1).getClicked().clickCategory().clickNew().enterName(catField).clickGroup().chooseImage();

//		Category_Page p2 = new Category_Page(driver);
//
//		p2.clickCategory();
//		p2.clickNew();
//
		
//		p2.enterName(catField);
//
//		p2.clickGroup();
//		p2.chooseImage();
//		p2.clickSave();
//		p2.pageScrolldown();
		
		
		sub = cat.clickSave();

		boolean isAlert = cat.isAlertDisplayed();
		assertTrue(isAlert, Constants.ERRORFORCATEGORYALERT);
		System.out.println(Constants.ERRORFORCATEGORYALERT);

	}
}
