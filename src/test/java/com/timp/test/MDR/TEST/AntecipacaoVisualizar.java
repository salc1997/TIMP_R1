package com.timp.test.MDR.TEST;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoCriarPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoVisualizarPO;

public class AntecipacaoVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AntecipacaoVisualizarPO antecipacaoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		antecipacaoVisualizarPO = new AntecipacaoVisualizarPO();
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
	/*
	 * @Test(priority = 2) public void visualizar() {
	 * 
	 * String sucesso = antecipacaoVisualizarPO.visualizar();
	 * 
	 * assertEquals(sucesso, "edit", EmpresaVisualizar); }
	 */
}
