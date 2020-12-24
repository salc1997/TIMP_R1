package com.timp.test.MDR.Centralizacao.Tributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosFiltrarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TributosFiltrar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	TributosFiltrarPO tributosFiltrarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		tributosFiltrarPO = new TributosFiltrarPO();
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
	public void filtrar() {
		boolean sucesso = tributosFiltrarPO.filtrar();
		assertTrue(sucesso, Filtros);
	}
}
