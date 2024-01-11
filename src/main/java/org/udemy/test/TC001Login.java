package org.udemy.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.udemy.LogInPage;
import org.udemy.dashBoard;
import org.udemy.base.Base;

public class TC001Login extends Base{
	
	
	@Test(dataProvider = "data")
	public void loginTest(String[] data)  {
		LogInPage lp = new LogInPage(driver, wait);


		
		boolean isDisplayed = lp.logInAccountLabel();
		Assert.assertEquals(isDisplayed, true);
		System.out.println(isDisplayed);

//		lp.logIn("Manikandan_9479@yahoo.com", "Padma@23662873");
//		lp.clickLogIn();
     
		//BDD style
		new LogInPage(driver, wait)
		.enterUserName(data[0])
		.enterUserPassword(data[1])
		.clickLogIn();
		
		dashBoard db  = new dashBoard(driver, wait); 
		boolean isDisplayed1 = db.welcomeLabel();
		Assert.assertTrue(isDisplayed1);
		
		//System.out.println("dashboard " + isDisplayed1);
		
		
	}
	


}
