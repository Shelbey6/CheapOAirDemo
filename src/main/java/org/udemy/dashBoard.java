package org.udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashBoard extends LogInPage {

	public dashBoard(RemoteWebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	
		
	}

	public boolean welcomeLabel() {
		return driver.findElement(By.xpath("//h2[@data-purpose=\"my-learning-unit-header\"]")).isDisplayed();
	}
	

}
