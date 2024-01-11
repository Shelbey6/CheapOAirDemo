package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testScenarios.TestMethods_GoogleSearch;

public class GoogleSearchPage extends TestMethods_GoogleSearch{
   //protected WebDriver driver;
   
   public GoogleSearchPage(WebDriver driver){
	   this.driver = driver;
   }
   
   By searchBox = By.name("q");
   By Search_btn = By.xpath("(//input[@name=\"btnK\"])[1]");
   By Facebook_link = By.xpath("//a/h3[text()='Facebook - log in or sign up']");
   
   public void googleSearch(String searchInput) {
	   try {
		driver.findElement(searchBox).sendKeys(searchInput);
		driver.findElement(Search_btn).click();
	} catch (Exception e) {
		System.out.println("Exception caught " + e.getMessage());
	}
	   
   }
   
   
   public void ClickFacebook() {
	   try {
		driver.findElement(Facebook_link).click();
	} catch (Exception e) {
		System.out.println("Exception caught " + e.getMessage());
	}
   }
   
   
   
}
