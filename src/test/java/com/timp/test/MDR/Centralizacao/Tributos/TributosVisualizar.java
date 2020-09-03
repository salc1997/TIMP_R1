package com.timp.test.MDR.Centralizacao.Tributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TributosVisualizar extends TestBaseEliel{
  LoginTC loginTC;
  AcessarMDRPO acessarMDRPO;
  TributosVisualizarPO tributosVisualizarPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationE();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  tributosVisualizarPO = new TributosVisualizarPO();
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
  public void visualizar() {
	  ArrayList<Boolean> sucesso = tributosVisualizarPO.visualizarTributo();
	  for (int i = 0; i < sucesso.size(); i++) {
			
			assertTrue(sucesso.get(i), visualizaçar);
			
		}
	 // assertEquals(sucesso, "edit", EmpresaVisualizar);
  }
}
