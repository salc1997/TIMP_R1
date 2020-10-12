package com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPICriarPO;

public class CodigoDeAjusteDaApuraçaoDoIPICriar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeAjusteDaApuraçaoDoIPICriarPO codigoDeAjusteDaApuraçaoDoIPICriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeAjusteDaApuraçaoDoIPICriarPO = new CodigoDeAjusteDaApuraçaoDoIPICriarPO();
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

		boolean sucesso = codigoDeAjusteDaApuraçaoDoIPICriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
