package org.udemy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logInOrganization extends LogInPage{
	logInOrganization(RemoteWebDriver driver, WebDriverWait wait){
		super(driver, wait);
	}
}
