package com.timp.test.TPC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TPC.AcessarTPCPO;
import com.sap.timp.pageObjectModel.TPC.ParametrosGeraisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisCriar extends TestBase {
	LoginTC loginTC;
	AcessarTPCPO acessarTPCPO;
	ParametrosGeraisCriarPO parâmetrosGeraisCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTPCPO = new AcessarTPCPO();
		parâmetrosGeraisCriarPO = new ParametrosGeraisCriarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarTPC() {

		acessarTPCPO.acessarTPC();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = parâmetrosGeraisCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
