package com.timp.test.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditoPorObrigacaoEditarPO;

public class TabelaDeCreditosPorObrigacaoEditar extends TestBaseEliel {

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeCreditoPorObrigacaoEditarPO tabelaDeCreditoPorObrigacaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeCreditoPorObrigacaoEditarPO = new TabelaDeCreditoPorObrigacaoEditarPO();
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

		boolean sucesso = tabelaDeCreditoPorObrigacaoEditarPO.editar();
		
		assertTrue(sucesso, Editar);

	}		
		
	
	
}
