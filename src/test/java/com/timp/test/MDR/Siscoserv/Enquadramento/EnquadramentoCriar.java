package com.timp.test.MDR.Siscoserv.Enquadramento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.Enquadramento.EnquadramentoCriarPO;

public class EnquadramentoCriar extends TestBaseEliel {

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EnquadramentoCriarPO enquadramentoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		enquadramentoCriarPO = new EnquadramentoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = enquadramentoCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
	
}