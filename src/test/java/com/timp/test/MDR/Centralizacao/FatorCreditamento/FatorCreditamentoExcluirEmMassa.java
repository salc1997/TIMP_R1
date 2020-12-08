package com.timp.test.MDR.Centralizacao.FatorCreditamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoCriarPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatorCreditamentoExcluirEmMassa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FatorCreditamentoExcluirEmMassaPO fatorCreditamentoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		fatorCreditamentoExcluirEmMassaPO = new FatorCreditamentoExcluirEmMassaPO();
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
		boolean sucesso = fatorCreditamentoExcluirEmMassaPO.fatorCreditamentoCriar();
		assertTrue(sucesso, Criar);
		
		boolean sucesso2 = fatorCreditamentoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
		
		
	}
}
