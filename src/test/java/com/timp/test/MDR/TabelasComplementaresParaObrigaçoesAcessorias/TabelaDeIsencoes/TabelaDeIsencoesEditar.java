package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeIsencoes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeIsencoes.TabelaDeIsencoesEditarPO;

public class TabelaDeIsencoesEditar extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeIsencoesEditarPO tabelaDeIsencoesEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeIsencoesEditarPO = new TabelaDeIsencoesEditarPO();
	}
	/*
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	*/
	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}
	

	@Test(priority = 2)
	public void editar() {

		boolean sucesso = tabelaDeIsencoesEditarPO.editar();
		
		assertTrue(sucesso, Editar);

	}		
			
	
	
	
}
