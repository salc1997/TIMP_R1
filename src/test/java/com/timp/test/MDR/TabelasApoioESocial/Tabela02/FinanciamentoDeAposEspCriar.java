package com.timp.test.MDR.TabelasApoioESocial.Tabela02;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspCriarPO;

public class FinanciamentoDeAposEspCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FinanciamentoDeAposEspCriarPO financiamentoDeAposEspCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		financiamentoDeAposEspCriarPO = new FinanciamentoDeAposEspCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = financiamentoDeAposEspCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
