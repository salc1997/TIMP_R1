package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalCriarPO;

public class S1250DetNotaFiscalCriar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250DetNotaFiscalCriarPO s1250DetNotaFiscalCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250DetNotaFiscalCriarPO = new S1250DetNotaFiscalCriarPO();
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
		boolean sucesso = s1250DetNotaFiscalCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
