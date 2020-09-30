package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10CriarPO;

public class TabelaDeDetalhamentosParaRegistro10Criar extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeDetalhamentosParaRegistro10CriarPO tabelaDeDetalhamentosParaRegistro10CriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeDetalhamentosParaRegistro10CriarPO = new TabelaDeDetalhamentosParaRegistro10CriarPO();
	}
	
	  @AfterClass public void afterClass(){ driver.close(); }
	 

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

		
		boolean sucesso = tabelaDeDetalhamentosParaRegistro10CriarPO.criar();
		assertTrue(sucesso, semAcesso);
		
	}			
	
	
}
