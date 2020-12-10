package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos.TabelaDeProdutosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.remote.NewSessionPayload;
import org.testng.annotations.AfterClass;

public class TabelaDeProdutosEditar extends TestBaseMassiel{
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeProdutosEditarPO tabelaDeProdutosEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	   driver = initializationM();
	   loginTC = new LoginTC();
	   acessarMDRPO = new AcessarMDRPO();
	   tabelaDeProdutosEditarPO = new TabelaDeProdutosEditarPO();
  }

  @AfterClass
  public void afterClass() {
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
	public void editar() {

		
		boolean sucesso = tabelaDeProdutosEditarPO.Editar();
		assertTrue(sucesso, semAcesso);

	}


}
