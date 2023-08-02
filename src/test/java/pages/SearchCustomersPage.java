package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.diagnostics.logging.Logger;

public class SearchCustomersPage {

	WebDriver driver;
	Logger log;

	public SearchCustomersPage(WebDriver rdriver) {

		
		//this.driver = driver;
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	
	
	@FindBy(css = "input#SearchEmail")
	WebElement email;
	
	@FindBy(css = "button#search-customers")
	WebElement searchBtn;
	
	
	//td[text()='victoria_victoria@nopCommerce.com']
	
	
	@FindBy(xpath = "//table[@id='customers-grid']/tbody/tr/td[2]")
	WebElement foundEmail;
	
	


public void searchCustomerbyEmail(String emailAddr){
		
	   email.clear();
	   email.sendKeys(emailAddr);
		
	}
	

public void clickSearchBtn() throws InterruptedException{
	
	
	  searchBtn.click();
	 
		
	}


public void emailFound_WebTable(String expectedEmail){
	

	 WebDriverWait wait = new WebDriverWait(driver,30);

	 wait.until(ExpectedConditions.textToBePresentInElement(foundEmail,expectedEmail));

	 }
	  
		
	}




	

	

