package com.timp.test.MDR.Centralizacao.FatorCreditamento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira.*;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoExcluirPO;

public class FatorCreditamentoExcluir extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
    FatorCreditamentoExcluirPO fatorCreditamentoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		fatorCreditamentoExcluirPO = new FatorCreditamentoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = fatorCreditamentoExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
