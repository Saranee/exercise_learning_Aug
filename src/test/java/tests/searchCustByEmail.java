package tests;

import org.testng.annotations.Test;

import utility.Constants;
import utility.Assignment1_DataProviders;

import takeScreenshot.TakeScreenshot;


public class searchCustByEmail extends TestBase{
	
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

		@Test(dataProvider="email",dataProviderClass = Assignment1_DataProviders.class,priority=2)	
		public void custByEmail(String email) throws Exception {
			
			log.info("Searching Customer using Email Id");
			scp.searchCustomerbyEmail(email);
			log.info("Clicking Search button");
			scp.clickSearchBtn();
			log.info("Check the searched email is displayed in webtable");
			scp.emailFound_WebTable(email);
			log.info("Found searched email!!");

		

		
		}


	

	}


