package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver rdriver) {

		
		//this.driver = driver;
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	
	
	@FindBy(xpath = "//p[text()[normalize-space()='Customers']]")
	WebElement cust_Menu;
	
	@FindBy(xpath = "(//p[text()[normalize-space()='Customers']])[2]")
	WebElement cust_Menu_list;
	
	
public void clickCustomersMenu() throws InterruptedException{
		

	cust_Menu.click();
		
	}
	

public void clickCustomerMenuList(){
	
	cust_Menu_list.click();
	
}
	

	}
	

	

