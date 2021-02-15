package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuraçãoDeCréditoTributárioPIS.ConfiguraçãoEExecução.RegistroM300;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuraçãoDeCréditoTributárioPIS.ConfiguraçãoEExecução.RegistroM300.RegistroM300VisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegistroM300Visualizar extends TestBaseMassiel {
 
	LoginTC loginTC;
	  AcessarTCCPO acessarTCCPO;
	  RegistroM300VisualizarPO registroM300VisualizarPO;
	  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM300VisualizarPO = new RegistroM300VisualizarPO();
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
	public void acessarTCC() {

		acessarTCCPO.acessarTCC();

	}
	
	@Test(priority = 2)
	public void visualizar() {
		
		
		
		ArrayList<Boolean> sucesso = registroM300VisualizarPO.Visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	
		
	}

}
