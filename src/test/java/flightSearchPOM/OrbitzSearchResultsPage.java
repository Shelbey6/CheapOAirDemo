package flightSearchPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrbitzSearchResultsPage {
	public static WebElement element = null;
	
	public static WebElement filterResults(WebDriver driver) throws InterruptedException {
		Thread.sleep(18000);
		element = driver.findElement(By.xpath("//div[@class=\"filters--content col-12 p-0\"]"));
		return element;
	}
			

}
