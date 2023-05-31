package com.timp.test.TCM;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCM.AcessarTCMPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarTCM extends TestBase {
	LoginTC loginTC;
	AcessarTCMPO acessarTCMPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCMPO = new AcessarTCMPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void tcmEntrar() {
		boolean sucesso = acessarTCMPO.acessarTCM();
		assertTrue(sucesso, "The element is not present");
	}

}
