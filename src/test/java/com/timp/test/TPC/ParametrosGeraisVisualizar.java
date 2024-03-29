package com.timp.test.TPC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TPC.AcessarTPCPO;
import com.sap.timp.pageObjectModel.TPC.ParametrosGeraisCriarPO;
import com.sap.timp.pageObjectModel.TPC.ParametrosGeraisVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisVisualizar extends TestBase {
	LoginTC loginTC;
	AcessarTPCPO acessarTPCPO;
	ParametrosGeraisVisualizarPO parāmetrosGeraisVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTPCPO = new AcessarTPCPO();
		parāmetrosGeraisVisualizarPO = new ParametrosGeraisVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarTPC() {

		acessarTPCPO.acessarTPC();

	}

	@Test(priority = 2)
	public void visualizar() {
		ArrayList<Boolean> sucesso = parāmetrosGeraisVisualizarPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}

}
