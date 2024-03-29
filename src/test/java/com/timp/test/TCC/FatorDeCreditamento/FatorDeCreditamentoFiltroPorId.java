package com.timp.test.TCC.FatorDeCreditamento;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento.FatorDeCreditamentoFiltroPorIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatorDeCreditamentoFiltroPorId extends TestBase {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	FatorDeCreditamentoFiltroPorIdPO fatorDeCreditamentoFiltroPorIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		fatorDeCreditamentoFiltroPorIdPO = new FatorDeCreditamentoFiltroPorIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtroPorId() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = fatorDeCreditamentoFiltroPorIdPO.filtroPorId();
		assertTrue(sucesso, Filtros);
	}

}
