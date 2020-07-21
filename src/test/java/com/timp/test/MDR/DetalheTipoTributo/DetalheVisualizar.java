package com.timp.test.MDR.DetalheTipoTributo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheVisualizarPO;

public class DetalheVisualizar extends TestBase{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DetalheVisualizarPO detalheVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		detalheVisualizarPO = new DetalheVisualizarPO();
	}

	/*
	 * @AfterClass public void afterClass() { driver.close(); }
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
	public void visualizar() {

		String sucesso = detalheVisualizarPO.visualizar();

		assertEquals(sucesso, "edit", EmpresaVisualizar);
	}
}
