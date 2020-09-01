package com.timp.test.MDR.CenariosCorrecao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CenariosCorrecao.CenariosCorrecaoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CenariosCorrecaoVisualizar extends TestBaseKathy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CenariosCorrecaoVisualizarPO cenariosCorrecaoVisualizarPO;
	
    @BeforeClass
    public void beforeClass() {
    	driver = initializationK();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cenariosCorrecaoVisualizarPO = new CenariosCorrecaoVisualizarPO();
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
    public void cenariosCorrecaoVisualizar() {
      ArrayList<Boolean> sucesso = cenariosCorrecaoVisualizarPO.cenariosCorrecaoVisualizar();
  	  
      for (int i = 0; i < sucesso.size(); i++) {
		assertTrue(sucesso.get(i), visualizaçar);
	}
    }
}
