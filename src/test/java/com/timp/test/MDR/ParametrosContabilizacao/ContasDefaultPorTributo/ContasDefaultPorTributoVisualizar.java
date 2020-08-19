package com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultPorTributo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultPorTributo.ContasDefaultPorTributoVisualizarPO;



public class ContasDefaultPorTributoVisualizar extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasDefaultPorTributoVisualizarPO contasDefaultPorTributoVisualizarPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasDefaultPorTributoVisualizarPO = new ContasDefaultPorTributoVisualizarPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void Visualizar() {

		String sucesso = contasDefaultPorTributoVisualizarPO.visualizar();
		
		 assertEquals(sucesso, "formBuilder-wrapper", visualizaçar);
	}	
	
}
