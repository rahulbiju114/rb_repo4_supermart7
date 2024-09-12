package testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Category_Page;
import pages.LoginPage_Page;
import pages.ManageProduct_Page;
import pages.SubCategory_Page;
import utilities.Exel_Utility;

public class SubCategory_TestCase extends BaseClass {
	
	public LoginPage_Page login;
	public Category_Page cat;
	public SubCategory_Page sub;
	public ManageProduct_Page mp;
	
	  @Test
	  public void enterValues() throws IOException {
		  
		  String uA1 = Exel_Utility.getStringData(1, 0, "Login1");  
		  String pA1 = Exel_Utility.getStringData(1, 1, "Login1");
		  
//		  LoginPage_Page p1 = new LoginPage_Page(driver);
//			p1.enterUsname(uA1);
//			p1.enterPass(pA1);
//			p1.getClicked();
		  
		 
			
//			
//			SubCategory_Page p2 = new SubCategory_Page(driver);
//			
//			p2.clickSubCategory();  
//			p2.clickNewButton(); 	
//			p2.clickDropDownSub();  	
//			
//
			 String catField = Exel_Utility.getStringData2(2, 1, "Sheet1");  
//			 p2.enterSubCat(catField);
//			
//			p2.chooseImage();		
//			p2.saveButton(); 
		  
			 login = new LoginPage_Page(driver);
			  sub = login.enterPass(pA1).enterUsname(uA1).getClicked().clickSubCategory().clickNewButton().clickDropDownSub().enterSubCat(catField).chooseImage();
			  mp = sub.saveButton();
			boolean isAlert = sub.isAlertDisplayed();                        
			assertTrue(isAlert, Constants.ERRORFORSUBCATEGORYALERT);
			System.out.println(Constants.ERRORFORSUBCATEGORYALERT);
		  
	  }
}
