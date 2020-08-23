package com.timp.test.MDR.Ativa�aoParaMunicipio;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioVisualizarPO;

public class Ativa�aoParaMunicipioVisualizar extends TestBaseEliel {
  
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Ativa�aoParaMunicipioVisualizarPO ativa�aoParaMunicipioVisualizarPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
	ativa�aoParaMunicipioVisualizarPO= new Ativa�aoParaMunicipioVisualizarPO();
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

		String sucesso = ativa�aoParaMunicipioVisualizarPO.visualizar();
		
		 assertEquals(sucesso, "baseTabs-view-wrapper top-0", visualiza�ar);
	}	
	
	
	
	
}
