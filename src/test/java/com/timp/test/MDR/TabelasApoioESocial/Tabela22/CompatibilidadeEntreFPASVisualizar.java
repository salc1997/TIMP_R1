package com.timp.test.MDR.TabelasApoioESocial.Tabela22;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CompatibilidadeEntreFPASVisualizar extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CompatibilidadeEntreFPASVisualizarPO compatibilidadeEntreFPASCriarFPASVisualizarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  compatibilidadeEntreFPASCriarFPASVisualizarPO = new CompatibilidadeEntreFPASVisualizarPO();
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
	  public void visualizarCompatibilidadeEntreFPAS() {
		 ArrayList<Boolean> sucesso = compatibilidadeEntreFPASCriarFPASVisualizarPO.visualizarCompatibilidadeEntreFPAS();

			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizaçar);
			}
	  }

}
