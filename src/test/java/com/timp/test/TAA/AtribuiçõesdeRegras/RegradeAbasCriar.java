package com.timp.test.TAA.AtribuiçõesdeRegras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoCriarPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegradeAbasCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeAbasCriar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegradeAbasCriarPO regradeAbasCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regradeAbasCriarPO = new RegradeAbasCriarPO();
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
	public void ingresarTAA() {
		acessarTAAPO.acessarTAA();
	}

	@Test(priority = 2)
	public void criar() {
		boolean sucesso = regradeAbasCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
