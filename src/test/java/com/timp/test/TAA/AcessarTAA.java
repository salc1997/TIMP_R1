package com.timp.test.TAA;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;

public class AcessarTAA extends TestBase{
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO  = new AcessarTAAPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void taaEntrar() {
		boolean sucesso =  acessarTAAPO.acessarTAA();
		assertTrue(sucesso, "The element is not present");
	}
}
