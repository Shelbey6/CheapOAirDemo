package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testScenarios.TestMethods_GoogleSearch;

public class FacebookPage extends TestMethods_GoogleSearch{


	public FacebookPage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
	}
     By user_EditBox = By.name("email");
     By password_EditBox = By.name("pass");
     By click_Login = By.xpath("//button[text()='Log In']");
     
     public void facebookLogInPage(String userName, String password) {
    	 try {
			driver.findElement(user_EditBox).sendKeys(userName);
			 driver.findElement(password_EditBox).sendKeys(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Exception caught " + e.getMessage());
		}
    	 
    	 
     }
     public WebElement F_LogInButton() {
    
    	 WebElement ele = driver.findElement(click_Login);
    	WebElement clickable = wait.until(ExpectedConditions.visibilityOf(ele));
    	 return clickable;
    	 
    	 
    	 
     }

}
