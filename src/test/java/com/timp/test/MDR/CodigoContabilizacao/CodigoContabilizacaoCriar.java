package com.timp.test.MDR.CodigoContabilizacao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondiçao.CadastroCondicaoCriarPO;
import com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao.CodigoContabilizacaoCriarPO;

public class CodigoContabilizacaoCriar extends TestBaseEliel {
  
	
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContabilizacaoCriarPO codigoContabilizacaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContabilizacaoCriarPO = new CodigoContabilizacaoCriarPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
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
	public void criar() {
		boolean sucesso = codigoContabilizacaoCriarPO.criar();
		//boolean text = cadastroCondicaoCriarPO.criar();
		//assertTrue(text, Criar);
		//Teste pra conferir se conseguiu acesssar o sistema
		assertTrue(sucesso, semAcesso);

		
	}	
	
	
	
}
