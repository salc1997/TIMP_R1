package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaReceitasCreditoFiscalAntecipado;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoCriarPO;

public class TabelaReceitasCreditoFiscalAntecipadoCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaReceitasCreditoFiscalAntecipadoCriarPO tabelaReceitasCreditoFiscalAntecipadoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaReceitasCreditoFiscalAntecipadoCriarPO = new TabelaReceitasCreditoFiscalAntecipadoCriarPO();
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

		boolean sucesso = tabelaReceitasCreditoFiscalAntecipadoCriarPO.criar();
		assertTrue(sucesso, Criar);

	}

}
