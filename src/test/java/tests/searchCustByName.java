package tests;

import org.testng.annotations.Test;

import utility.Constants;
import utility.Assignment1_DataProviders;

import takeScreenshot.TakeScreenshot;


public class searchCustByName extends TestBase{
	
	TakeScreenshot shot;

		@Test(priority=0)
		public void verifyLoginFeature() throws Exception {
			
			
	       log.info("Logging into NOP Application using valid credentials");
		   lp.login(Constants.username, Constants.password);
			

		
		}
		
		@Test(priority=1)
		public void clickCustomerMenu() throws Exception {
			
            log.info("Select Customers from Menu");
			dp.clickCustomersMenu();
			log.info("Select Customers from CustomerMenu List");
			dp.clickCustomerMenuList();
		

		
		}

		@Test(dataProvider="name",dataProviderClass = Assignment1_DataProviders.class,priority=2)	
		public void custByName(String fname, String lname) throws Exception {
			
			log.info("Searching Customer using Email Id");
			scp.searchCustomerbyName(fname,lname);
			log.info("Clicking Search button");
			scp.clickSearchBtn();
			log.info("Check the searched customer name is displayed in webtable");
			scp.nameFound_WebTable(fname+" "+lname);
			log.info("Found searched customer Name!!");

		

		
		}


	

	}


