package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas.TabelaCodigoReceitasEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaCodigoReceitasEditar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaCodigoReceitasEditarPO tabelaCodigoReceitasEditarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	   loginTC = new LoginTC();
	   acessarMDRPO = new AcessarMDRPO();
	   tabelaCodigoReceitasEditarPO = new TabelaCodigoReceitasEditarPO();
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
	public void editar() {

		
		boolean sucesso = tabelaCodigoReceitasEditarPO.Editar();
		assertTrue(sucesso, semAcesso);

	}

}
