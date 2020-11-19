package com.timp.test.MDR.ParametrosParaCategoriaDeIRF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosParaCategoriaDeIRFVisualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParametrosParaCategoriaDeIRFVisualizarPO parametrosParaCategoriaDeIRFVisualizarPO;

  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		parametrosParaCategoriaDeIRFVisualizarPO = new ParametrosParaCategoriaDeIRFVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}
	@Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	public void visualizar() {
		
		parametrosParaCategoriaDeIRFVisualizarPO.Visualizar();
		//ArrayList<Boolean> sucesso = regradeReaberturaVisualizarPO.visualizar();

		//for (int i = 0; i < sucesso.size(); i++) {
		//	assertTrue(sucesso.get(i), visualizaçar);
		//}
	}

}
