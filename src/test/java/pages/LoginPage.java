package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

		
		//this.driver = driver;
		driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	
	
	@FindBy(css = "input#Email")
	WebElement txt_email;
	
	@FindBy(css = "input#Password")
	WebElement txt_Pass;
	
	
	@FindBy(tagName = "button")
	WebElement btn_Login;
	
	// Methods/Actions
	public void enterEmail(String email) {

		txt_email.clear();
		txt_email.sendKeys(email);

	}

	public void enterPass(String pwd) {


		txt_Pass.clear();
		txt_Pass.sendKeys(pwd);

	}

	public void clickLoginButton() {

		btn_Login.click();

	}
	
	
	public void login(String email, String pass) {
		
		enterEmail(email);
		enterPass(pass);
		clickLoginButton();
		
	}
	

}
