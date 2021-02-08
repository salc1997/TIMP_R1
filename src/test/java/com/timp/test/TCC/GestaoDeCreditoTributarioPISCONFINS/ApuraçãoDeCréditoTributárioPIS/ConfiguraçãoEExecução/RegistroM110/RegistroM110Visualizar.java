package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuraçãoDeCréditoTributárioPIS.ConfiguraçãoEExecução.RegistroM110;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuraçãoDeCréditoTributárioPIS.ConfiguraçãoEExecução.RegistroM110.RegistroM110VisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegistroM110Visualizar  extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	RegistroM110VisualizarPO registroM110VisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM110VisualizarPO = new RegistroM110VisualizarPO();
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
 		
 		
 		ArrayList<Boolean> sucesso = registroM110VisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
 	}


}
