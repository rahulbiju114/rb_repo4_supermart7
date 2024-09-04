package testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import Constants.Constants;
import Pages.AdminUsers_Page;
import Pages.LoginPage_Page;
import Utilities.Exel_Utility;

public class AdminUser_TestCase_ActiveButton extends BaseClass {
	  @Test(groups = {"Smoke"})  											//grouping - config.properties 
	  public void enterValues() throws IOException {
		  
		  String uA1 = Exel_Utility.getStringData(1, 0, "Login1");   // 6Exel. 2nd way - Read from exel  // throws IOException
		  String pA1 = Exel_Utility.getStringData(1, 1, "Login1");
			
			

			LoginPage_Page p1 = new LoginPage_Page(driver);
			p1.enterUsname(uA1);
			p1.enterPass(pA1);
			p1.getClicked();
			
			AdminUsers_Page admin1 = new AdminUsers_Page(driver);
			admin1.clickAdminUser();
			admin1.clickActiveButton();
			
			boolean isAlert = admin1.isAlertDisplayed();
			assertTrue(isAlert, Constants.ERRORFORADMINUSERALERTACTIVE);
	  }
}
