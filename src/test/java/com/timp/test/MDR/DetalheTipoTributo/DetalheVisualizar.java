package com.timp.test.MDR.DetalheTipoTributo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheVisualizarPO;

public class DetalheVisualizar extends TestBaseSteven{

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

		ArrayList<Boolean> sucesso = detalheVisualizarPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			
			assertTrue(sucesso.get(i), visualizaçar);
			
		}
		//assertEquals(sucesso, "edit", EmpresaVisualizar);
	}
}
