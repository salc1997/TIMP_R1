package com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraCriarPO;

public class DeterminacaoDeRelevanciaPorRegraCriar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeRelevanciaPorRegraCriarPO determinacaoDeRelevanciaPorRegraCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeRelevanciaPorRegraCriarPO = new DeterminacaoDeRelevanciaPorRegraCriarPO();
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

		boolean sucesso = determinacaoDeRelevanciaPorRegraCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}