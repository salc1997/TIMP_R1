package com.timp.test.MDR.DeterminacaoAutomaticaDeGuias;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias.DeterminacaoAutomaticaDeGuiasVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DeterminacaoAutomaticaDeGuiasVisualizar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoAutomaticaDeGuiasVisualizarPO determinacaoAutomaticaDeGuiasVisualizarPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  determinacaoAutomaticaDeGuiasVisualizarPO = new DeterminacaoAutomaticaDeGuiasVisualizarPO();
	  
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }
  
  @Test
  public void visualizar() {
	  loginTC.login();
	  acessarMDRPO.acessarMDR();
	 
	 
	  ArrayList<Boolean> sucesso =  determinacaoAutomaticaDeGuiasVisualizarPO.Visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		sleep(3000);
  }
}
