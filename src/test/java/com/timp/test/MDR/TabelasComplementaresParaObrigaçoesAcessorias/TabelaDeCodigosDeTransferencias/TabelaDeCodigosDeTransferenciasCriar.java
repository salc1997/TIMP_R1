package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigosDeTransferencias;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasCriarPO;

public class TabelaDeCodigosDeTransferenciasCriar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeCodigosDeTransferenciasCriarPO tabelaDeCodigosDeTransferenciasCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeCodigosDeTransferenciasCriarPO = new TabelaDeCodigosDeTransferenciasCriarPO();
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

		boolean sucesso = tabelaDeCodigosDeTransferenciasCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
