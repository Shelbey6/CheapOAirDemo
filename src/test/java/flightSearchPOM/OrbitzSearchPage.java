package flightSearchPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrbitzSearchPage {
	public static WebElement element = null;
	
	public static void clearDepSuggestionBox(WebDriver driver) {
		// clear Dep suggestion box
		WebElement clearDepSugBox = driver.findElement(By.xpath("//input[@id=\"from0\"]//following-sibling::a[@class=\"suggestion-box__clear icon\"]"));
	    clearDepSugBox.click();
	}
	
	public static void clearArrSuggestionBox(WebDriver driver){
		// clear Arrival suggestion box
					WebElement clearArrSugBox = driver.findElement(By.xpath("//input[@id=\"to0\"]//following-sibling::a[@class=\"suggestion-box__clear icon\"]"));
					clearArrSugBox.click();		
		
	}
	
	public static WebElement depTextBox(WebDriver driver) {
		
	element	= driver.findElement(By.id("from0"));
	return element;
	}
	
	public static WebElement arrTextBox(WebDriver driver) {
		
    element	= driver.findElement(By.id("to0"));
	return element;
    }
	
	public static WebElement depCalendarBox(WebDriver driver) {
	    element = driver.findElement(By.id("cal0"));
	  return element;
	}
	
	
	
	public static void chooseDepDate(WebDriver driver) throws InterruptedException {
		//choose Departure Date.
		Thread.sleep(3000);
		WebElement depCalendar = driver.findElement(By.xpath("//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"30 October 2023\"]"));
		depCalendar.click();
	}
	
	public static void chooseArrDate(WebDriver driver) {
		//choose arrival Date.
		WebElement arrCalender = driver.findElement(By.xpath("//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"31 October 2023\"]"));
		arrCalender.click();
	}
	
	public static WebElement searchNowButton(WebDriver driver) {
		
		element = driver.findElement(By.id("searchNow"));
        return element;
	}
			//choose Arrival Date.
			
			
			

}
