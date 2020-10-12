package com.timp.test.MDR.Filiais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Filiais.FiliaisVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class FiliaisVisualizar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FiliaisVisualizarPO filiaisVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		filiaisVisualizarPO = new FiliaisVisualizarPO();
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

		String sucesso = filiaisVisualizarPO.visualizar();

		assertEquals(sucesso, "edit", EmpresaVisualizar);

	}

}
