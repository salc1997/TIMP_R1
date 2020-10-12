package com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSitua�aoTributaria.TabelaCodigoDaSitua�aoTributariaVisualizarPO;

public class HierarquiaDeCenariosDeCorre�aoVisualizar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorre�aoVisualizarPO hierarquiaDeCenariosDeCorre�aoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorre�aoVisualizarPO = new HierarquiaDeCenariosDeCorre�aoVisualizarPO();
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
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void visualizar() {

		String sucesso = hierarquiaDeCenariosDeCorre�aoVisualizarPO.visualizar();

		assertEquals(sucesso, "baseTabs-view-wrapper", visualiza�ar);
	}

}
