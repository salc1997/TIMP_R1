package com.timp.test.ATR.Estruturas.Estruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarPO;

public class EstruturasVisualizar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstruturasVisualizarPO estruturasVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		estruturasVisualizarPO = new  EstruturasVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}


	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ATREntrar() {
		acessarATRPO.acessarATR();
	}

	@Test(priority = 1)
	public void visualizar() {
		boolean sucesso = estruturasVisualizarPO.visualizar();
		assertTrue(sucesso, visualizaçar);
	}
}
