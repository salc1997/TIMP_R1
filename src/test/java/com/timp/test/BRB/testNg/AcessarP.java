package com.timp.test.BRB.testNg;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseParalelo2;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.prueba.*;

public class AcessarP extends TestBaseParalelo2 {
	AcessarBrbPO acessarBrbPO;
	LoginTC loginTC;
	
	@BeforeTest
	public void beforeClass() {
		getDriver().get(tq1);

		acessarBrbPO = new AcessarBrbPO();
		loginTC = new LoginTC();
	}

	@AfterTest
	public void afterClass() {
		tearDown();
	}

	@Test
	public void brbEntrar() {
		
		loginTC.login();
		boolean sucesso = acessarBrbPO.acessar();

		assertTrue(sucesso, semAcesso);

	}

}
