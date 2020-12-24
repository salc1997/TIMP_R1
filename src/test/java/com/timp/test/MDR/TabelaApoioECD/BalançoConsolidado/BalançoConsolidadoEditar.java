package com.timp.test.MDR.TabelaApoioECD.BalançoConsolidado;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.BalançoConsolidado.BalançoConsolidadoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class BalançoConsolidadoEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	BalançoConsolidadoEditarPO balançoConsolidadoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		balançoConsolidadoEditarPO = new BalançoConsolidadoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	public void editar() {
		boolean sucesso = balançoConsolidadoEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
