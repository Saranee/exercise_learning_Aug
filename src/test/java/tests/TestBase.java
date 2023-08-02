package tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SearchCustomersPage;
import utility.Constants;


public class TestBase {
	
	public WebDriver driver;
	public LoginPage lp;
	public DashboardPage dp;
	public SearchCustomersPage scp;
	
	Logger log;

	@BeforeTest
	public void launchApp() {
		
		log = Logger.getLogger("nopComm Application");
		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		log.info("---------------info-------------");
		log.warn("---------------warn-------------");
		log.error("---------------error-------------");
		
		log.info("launching chrome browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		log.info("launching application: " + Constants.nop_app);
		driver.get(Constants.nop_app);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//create an object on Pages
		lp = new LoginPage(driver);
		
		dp = new DashboardPage(driver);
		
		scp = new SearchCustomersPage(driver);
		
	}

	@AfterTest
	public void closeApp() throws Exception {
		
		
		log.info("closing an application");
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
		
	}
}
