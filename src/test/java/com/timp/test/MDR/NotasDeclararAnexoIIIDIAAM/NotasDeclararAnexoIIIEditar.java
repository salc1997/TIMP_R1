package com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class NotasDeclararAnexoIIIEditar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	NotasDeclararAnexoIIIEditarPO notasDeclararAnexoIIIEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		notasDeclararAnexoIIIEditarPO = new NotasDeclararAnexoIIIEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		boolean sucesso = notasDeclararAnexoIIIEditarPO.Editar();
		assertTrue(sucesso, Editar);

	}

}
