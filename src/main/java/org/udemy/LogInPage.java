package org.udemy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.udemy.base.Base;

public class LogInPage extends Base{
    
	public LogInPage(RemoteWebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait= wait;
	}
	
	//	locators 
	public boolean logInAccountLabel() {
		return driver.findElement(By.cssSelector("[id=\"auth-to-udemy-title\"]")).isDisplayed();
	}
	
	// actions
	
	public LogInPage enterUserName(String name) {
		driver.findElement(By.name("email")).sendKeys(name);
		return this;
	}
	
	public LogInPage enterUserPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public LogInPage clickLogIn()  {
		
   WebElement ele = driver.findElement
    (By.xpath("//button[@type=\"submit\"]//span[text()='Log in']"));
   wait.until(ExpectedConditions.elementToBeClickable(ele));
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   ele.click();
		
//		boolean selected = ele.isSelected();
//		Assert.assertTrue(selected);
		return new dashBoard(driver, wait);
	}
	
	public forgotPasswordClick forgotPasswordClick() {
		driver.findElement(By.linkText("Forgot Password")).click();
		return new forgotPasswordClick(driver, wait);
	}
	
	public signUp signUp() {
		driver.findElement(By.xpath("//div[@class=\"ud-text-sm\"]//following-sibling::a")).click();
		return new signUp(driver, wait);
	}
	
	public logInOrganization logInOrganization() {
		driver.findElement(By.linkText("Log in with your organization")).click();
		return new logInOrganization(driver, wait);
	}
	
	/**
	 * @description this function is used to be login 
	 * @param name
	 * @param password
	 * @throws InterruptedException 
	 */
	public void logIn(String name, String password) {
		enterUserName(name);
		enterUserPassword(password);
		clickLogIn();
	}
    
}
