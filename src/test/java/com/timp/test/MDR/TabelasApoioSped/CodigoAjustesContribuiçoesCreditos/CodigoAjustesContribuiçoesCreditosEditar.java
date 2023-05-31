package com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos.CodigoAjustesContribuiçoesCreditosEditarPO;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class CodigoAjustesContribuiçoesCreditosEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CodigoAjustesContribuiçoesCreditosEditarPO codigoAjustesContribuiçoesCreditosEditarPO;

	public CodigoAjustesContribuiçoesCreditosEditar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		codigoAjustesContribuiçoesCreditosEditarPO = new CodigoAjustesContribuiçoesCreditosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		codigoAjustesContribuiçoesCreditosEditarPO.editar();
	}
}
