package com.timp.test.MDR.Centralizacao.EstornoCredito;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito.*;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class EstornoCreditoVisualizar extends TestBaseEliel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EstornoCreditoVisualizarPO estornoCreditoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		estornoCreditoVisualizarPO = new EstornoCreditoVisualizarPO();
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
	public void Visualizar() {

		String sucesso = estornoCreditoVisualizarPO.visualizar();

		assertEquals(sucesso, "edit", visualizaçar);
	}
}
