package org.udemy.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadDataIntegrationWithExcel;


public class Base {
	
protected  RemoteWebDriver driver = null;
protected WebDriverWait wait = null;

@DataProvider(name="data")
public String[][] dataProvider() {
	String[][] exceldata = ReadDataIntegrationWithExcel.getExcelData("TC001");
	return exceldata;
}

@BeforeMethod
public void setUp() {
	driver = new ChromeDriver();
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.udemy.com/join/login-popup/");
	
}
@AfterMethod
public void tearDown() {
	driver.quit();
}

}
