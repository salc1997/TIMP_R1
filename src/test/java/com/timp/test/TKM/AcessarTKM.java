package com.timp.test.TKM;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.TKM.AcessarTKMPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarTKM extends TestBase {
	LoginTC loginTC;
	AcessarTKMPO  acessarTKMPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTKMPO = new AcessarTKMPO();
	}

	@AfterClass
	public void afterClass() {
	}


	@Test(priority = 1)
	public void TKMEntrar() {
		loginTC.login();
		boolean sucesso = acessarTKMPO.acessarTKM();
		assertTrue(sucesso, "The element is not present");

	}

}
