package com.timp.test.TPC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TPC.AcessarTPCPO;
import com.sap.timp.pageObjectModel.TPC.ParametrosGeraisAprovarPO;
import com.sap.timp.pageObjectModel.TPC.ParametrosGeraisCancelarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ParametrosGeraisCancelar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTPCPO acessarTPCPO;
	ParametrosGeraisCancelarPO parâmetrosGeraisCancelarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTPCPO = new AcessarTPCPO();
		parâmetrosGeraisCancelarPO = new ParametrosGeraisCancelarPO();
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
	public void cacelado() {

		boolean sucesso = parâmetrosGeraisCancelarPO.cacelado();
	}

}
