
package com.timp.test.ADM;

import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
 
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginPage;

public class LoginBRB extends TestBase {

	LoginPage loginPage;

	public LoginBRB() {
		super();
	}

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginPage = new LoginPage();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void Login() {

		loginPage.login();

	}

}
