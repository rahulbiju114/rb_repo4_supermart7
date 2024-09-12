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
	
	  @Test(groups = {"Smoke"})  											//grouping - config.properties 
	  public void enterValues() throws IOException {
		  
		  String uA1 = Exel_Utility.getStringData(1, 0, "Login1");   // 6Exel. 2nd way - Read from exel  // throws IOException
		  String pA1 = Exel_Utility.getStringData(1, 1, "Login1");
			
			

//			LoginPage_Page p1 = new LoginPage_Page(driver);
//			p1.enterUsname(uA1);
//			p1.enterPass(pA1);
//			p1.getClicked();
			
//			AdminUsers_Page admin1 = new AdminUsers_Page(driver);
//			admin1.clickAdminUser();
//			admin1.clickActiveButton();
		  login = new LoginPage_Page(driver);
		  admin = login.enterUsname(pA1).enterPass(uA1).getClicked();
		  cat = admin.clickAdminUser().clickActiveButton();
			
			boolean isAlert = admin.isAlertDisplayed();
			assertTrue(isAlert, Constants.ERRORFORADMINUSERALERTACTIVE);
	  }
}
