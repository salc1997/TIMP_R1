package com.timp.test.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos.RegraDeCamposCriarPO;

public class RegraDeCamposCriar extends TestBase {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegraDeCamposCriarPO regraDeCamposCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regraDeCamposCriarPO = new RegraDeCamposCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = regraDeCamposCriarPO.criar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}
}
