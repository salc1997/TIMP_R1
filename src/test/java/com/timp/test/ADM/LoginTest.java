package com.timp.test.ADM;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginPage;



public class LoginTest extends TestBaseSteven{
	
	LoginPage loginPage;

	
	public LoginTest() {
		super();
	}
	
	
	@BeforeClass
    public void beforeClass() {
		
    	driver = initialization();
    	loginPage = new LoginPage();


    }
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}
    
    
	@Test(priority = 0)
	public void Login(){
		
		
		loginPage.login();
	
				
		
	}


}
