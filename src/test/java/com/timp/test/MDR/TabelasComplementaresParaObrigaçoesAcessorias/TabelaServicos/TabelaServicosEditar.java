package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos.TabelaServicosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaServicosEditar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaServicosEditarPO tabelaServicosEditarPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	   loginTC = new LoginTC();
	   acessarMDRPO = new AcessarMDRPO();
	   tabelaServicosEditarPO = new TabelaServicosEditarPO();
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

		
		boolean sucesso = tabelaServicosEditarPO.Editar();
		assertTrue(sucesso, semAcesso);

	}

}
