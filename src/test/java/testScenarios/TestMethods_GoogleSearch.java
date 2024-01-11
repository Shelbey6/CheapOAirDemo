package testScenarios;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.FacebookPage;
import objects.GoogleSearchPage;

public class TestMethods_GoogleSearch {
  protected WebDriver driver;
  protected WebDriverWait wait;
  GoogleSearchPage objectRepo;
  FacebookPage FBookObjext;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 1)
	public void SearchOptions() {
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.googleSearch("facebook");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	public void verifyAndAccessFacebook() {
		objectRepo = new GoogleSearchPage(driver);
		objectRepo.ClickFacebook();
		
	}
	@Test(priority = 3)
	public void F_LoginPage() {
		FBookObjext = new FacebookPage(driver, wait);
		FBookObjext.facebookLogInPage("4122774998", "Friday!11");
		
		FBookObjext.F_LogInButton().click();;
		
	}
	
	
	@AfterTest
	public void aftertest() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();
	}
	
	
}
