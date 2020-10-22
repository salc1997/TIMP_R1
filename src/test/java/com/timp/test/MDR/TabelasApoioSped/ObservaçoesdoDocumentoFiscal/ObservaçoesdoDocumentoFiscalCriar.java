package com.timp.test.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Observa�oesdoDocumentoFiscal.Observa�oesdoDocumentoFiscalCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Observa�oesdoDocumentoFiscalCriar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Observa�oesdoDocumentoFiscalCriarPO observa�oesdoDocumentoFiscalCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		observa�oesdoDocumentoFiscalCriarPO = new Observa�oesdoDocumentoFiscalCriarPO();
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

		// observa�oesdoDocumentoFiscalCriarPO.criar();

		boolean sucesso = observa�oesdoDocumentoFiscalCriarPO.criar();
		assertTrue(sucesso, semAcesso);
	}

}
