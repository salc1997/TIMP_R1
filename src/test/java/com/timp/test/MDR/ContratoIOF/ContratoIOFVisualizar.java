package com.timp.test.MDR.ContratoIOF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ContratoIOF.ContratoIOFVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ContratoIOFVisualizar extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContratoIOFVisualizarPO contratoIOFVisualizarPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contratoIOFVisualizarPO = new ContratoIOFVisualizarPO();
	}
	
	@AfterClass public void afterClass(){ driver.close(); }
	

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

		ArrayList<Boolean> sucesso = contratoIOFVisualizarPO.visualizar();
		
		 for (int i = 0; i < sucesso.size(); i++) {
				
				assertTrue(sucesso.get(i), visualizaçar);
				
			}
		
		//assertEquals(sucesso, "edit", visualizaçar);
		
		 //Teste pra conferir se conseguiu acesssar o sistema
		assertTrue(contratoIOFVisualizarPO.mostrar.isDisplayed(), semAcesso);
	}
  
}
