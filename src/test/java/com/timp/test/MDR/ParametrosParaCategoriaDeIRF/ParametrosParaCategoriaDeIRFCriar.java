package com.timp.test.MDR.ParametrosParaCategoriaDeIRF;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFCriarPO;
 
  



import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaCategoriaDeIRFCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaCategoriaDeIRFCriarPO parametrosParaCategoriaDeIRFCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaCategoriaDeIRFCriarPO = new ParametrosParaCategoriaDeIRFCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = parametrosParaCategoriaDeIRFCriarPO.criar();
		assertTrue(sucesso, Criar);


	}

}
