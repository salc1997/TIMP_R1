package com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoVisualizarPO;

public class ContasDefaultParaExtemporaneoVisualizar extends TestBaseEliel {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasDefaultParaExtemporaneoVisualizarPO contasDefaultParaExtemporaneoVisualizarPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasDefaultParaExtemporaneoVisualizarPO = new ContasDefaultParaExtemporaneoVisualizarPO();
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

		String sucesso = contasDefaultParaExtemporaneoVisualizarPO.visualizar();
		
		 assertEquals(sucesso, "baseTabs-view-wrapper", visualiza�ar);
	}	
	
	
	
	
	
	
	
}