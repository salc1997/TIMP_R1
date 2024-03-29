package com.timp.test.TDK;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BSC.AcessarBSCPO;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarTDK extends TestBase{
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new  AcessarTDKPO();
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
	public void TDKEntrar() {


		boolean sucesso =  acessarTDKPO.acessarTDK();
		assertTrue(sucesso, "The element is not present");

	}
}
