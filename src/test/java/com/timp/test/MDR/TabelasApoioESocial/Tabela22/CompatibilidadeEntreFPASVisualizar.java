package com.timp.test.MDR.TabelasApoioESocial.Tabela22;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CompatibilidadeEntreFPASVisualizar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CompatibilidadeEntreFPASVisualizarPO compatibilidadeEntreFPASCriarFPASVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		compatibilidadeEntreFPASCriarFPASVisualizarPO = new CompatibilidadeEntreFPASVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizarCompatibilidadeEntreFPAS() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = compatibilidadeEntreFPASCriarFPASVisualizarPO.visualizarCompatibilidadeEntreFPAS();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}

}
