package com.timp.test.TPC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TPC.AcessarTPCPO;
import com.sap.timp.pageObjectModel.TPC.ParâmetrosGeraisAprovarPO;
import com.sap.timp.pageObjectModel.TPC.ParâmetrosGeraisCancelarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ParâmetrosGeraisCancelar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTPCPO acessarTPCPO;
	ParâmetrosGeraisCancelarPO parâmetrosGeraisCancelarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTPCPO = new AcessarTPCPO();
		parâmetrosGeraisCancelarPO = new ParâmetrosGeraisCancelarPO();
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
