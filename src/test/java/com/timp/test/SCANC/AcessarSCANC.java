package com.timp.test.SCANC;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.SCANC.AcessarSCANCPO;


public class AcessarSCANC extends TestBase{
	LoginTC loginTC;
	AcessarSCANCPO acessarSCANCPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarSCANCPO = new  AcessarSCANCPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void scancEntrar() {
		boolean sucesso =  acessarSCANCPO.acessarSCANC();
		assertTrue(sucesso, "The element is not present");
	}
}
