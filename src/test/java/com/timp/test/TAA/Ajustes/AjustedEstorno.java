package com.timp.test.TAA.Ajustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Ajuste.AjustedEstornoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjustedEstorno extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AjustedEstornoPO ajustedEstornoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		ajustedEstornoPO = new AjustedEstornoPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void TAAEntrar() {
		acessarTAAPO.acessarTAA();

	}

	@Test(priority = 2)
	public void ajustesEstorno() {

		boolean sucesso = ajustedEstornoPO.estorno();
		assertTrue(sucesso, Criar);

	}
}
