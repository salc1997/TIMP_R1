package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeProdutos.TabelaDeProdutosVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TabelaDeProdutosVisualizar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeProdutosVisualizarPO tabelaDeProdutosVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeProdutosVisualizarPO = new TabelaDeProdutosVisualizarPO();
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
	public void visualizar() {

		ArrayList<Boolean> sucesso = tabelaDeProdutosVisualizarPO .visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}


}
