package com.timp.test.MDR.TabelaApoioECD;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeisPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoFatosContabeis extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CodigoFatosContabeisPO ecd;

	public CodigoFatosContabeis() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		ecd = new CodigoFatosContabeisPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void mdrEntrar() {
		boolean sucesso = acesarMDRPO.acessarMDR();
		assertTrue(sucesso, "The element is not present");
	}

	@Test(priority = 3)
	public void criar() {
		boolean sucesso = ecd.criar();
		assertTrue(sucesso, "There is an error...");
	}
}
