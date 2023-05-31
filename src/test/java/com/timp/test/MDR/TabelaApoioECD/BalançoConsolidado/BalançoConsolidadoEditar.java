package com.timp.test.MDR.TabelaApoioECD.Balan�oConsolidado;

import org.testng.annotations.Test;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.Balan�oConsolidado.Balan�oConsolidadoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Balan�oConsolidadoEditar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	Balan�oConsolidadoEditarPO balan�oConsolidadoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		balan�oConsolidadoEditarPO = new Balan�oConsolidadoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		boolean sucesso = balan�oConsolidadoEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
