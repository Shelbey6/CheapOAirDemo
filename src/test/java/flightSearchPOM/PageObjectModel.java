package flightSearchPOM;

//import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import flightSearchPOM.OrbitzSearchPage;

public class PageObjectModel {
	WebDriver driver;
    String baseURL;
	@Before
	public void setUp() throws Exception {
		 baseURL= "https://www.cheapoair.com/";

		 driver = new ChromeDriver();
		 driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException {
		OrbitzSearchPage.clearDepSuggestionBox(driver);
		OrbitzSearchPage.depTextBox(driver).sendKeys("columbus");
		OrbitzSearchPage.clearArrSuggestionBox(driver);
		OrbitzSearchPage.arrTextBox(driver).sendKeys("cleveland");;
		OrbitzSearchPage.depCalendarBox(driver).click();
		OrbitzSearchPage.chooseDepDate(driver);
		OrbitzSearchPage.chooseArrDate(driver);
		OrbitzSearchPage.searchNowButton(driver).click();
		
		String resultFound = OrbitzSearchResultsPage.filterResults(driver).getText();
		System.out.println(resultFound);
		
		
	}
	public void secondTest() throws InterruptedException {
		OrbitzSearchPage.clearDepSuggestionBox(driver);
		OrbitzSearchPage.depTextBox(driver).sendKeys("Nashville");
		OrbitzSearchPage.clearArrSuggestionBox(driver);
		OrbitzSearchPage.arrTextBox(driver).sendKeys("pittsburgh");;
		OrbitzSearchPage.depCalendarBox(driver).click();
		OrbitzSearchPage.chooseDepDate(driver);
		OrbitzSearchPage.chooseArrDate(driver);
		OrbitzSearchPage.searchNowButton(driver).click();
		
		String resultFound = OrbitzSearchResultsPage.filterResults(driver).getText();
		System.out.println(resultFound);
		
		
	}


	@After
	public void tearDown() throws Exception {
	}

	
}
