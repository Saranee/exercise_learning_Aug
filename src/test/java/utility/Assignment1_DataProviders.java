package utility;

import org.testng.annotations.DataProvider;



public class Assignment1_DataProviders  {

		
		@DataProvider(name="email")
		public static Object[][] emailId() {
			
			
			Object [][] data = { {"victoria_victoria@nopCommerce.com"}};
			return data;
			
		}
		
		
		@DataProvider(name="name")
		public static Object[][] customerName() {
			
			
			Object [][] data = { {"Virat","Kohli"}};
			return data;
		
	}


}
