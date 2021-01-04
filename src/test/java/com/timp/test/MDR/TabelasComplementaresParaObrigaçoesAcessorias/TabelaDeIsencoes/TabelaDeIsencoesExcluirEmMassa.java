package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeIsencoes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesExcluirEmMassaPO;

public class TabelaDeIsencoesExcluirEmMassa extends TestBaseEliel {
	
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeIsencoesExcluirEmMassaPO tabelaDeIsencoesExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeIsencoesExcluirEmMassaPO = new TabelaDeIsencoesExcluirEmMassaPO();
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

		boolean sucesso = tabelaDeIsencoesExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = tabelaDeIsencoesExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
