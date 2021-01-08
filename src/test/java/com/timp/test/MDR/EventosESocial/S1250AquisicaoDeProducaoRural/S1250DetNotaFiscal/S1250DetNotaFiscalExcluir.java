package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalExcluirPO;

public class S1250DetNotaFiscalExcluir extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250DetNotaFiscalExcluirPO s1250DetNotaFiscalExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250DetNotaFiscalExcluirPO = new S1250DetNotaFiscalExcluirPO();
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
	public void excluir() {
		boolean sucesso = s1250DetNotaFiscalExcluirPO.excluir();
		assertTrue(sucesso, Criar);
	}
}
