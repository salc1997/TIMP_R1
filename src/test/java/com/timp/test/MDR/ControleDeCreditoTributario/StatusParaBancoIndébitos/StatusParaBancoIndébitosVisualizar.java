package com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBancoIndébitos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBancoIndébitos.StatusParaBancoIndébitosVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class StatusParaBancoIndébitosVisualizar extends TestBaseCristhian{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	StatusParaBancoIndébitosVisualizarPO statusParaBancoIndébitosVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		statusParaBancoIndébitosVisualizarPO = new StatusParaBancoIndébitosVisualizarPO();
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

		ArrayList<Boolean> sucesso = statusParaBancoIndébitosVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualizaçar);

		}

	}
}
