package com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraCriarPO;

public class DeterminacaoDeRelevanciaPorRegraCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeRelevanciaPorRegraCriarPO determinacaoDeRelevanciaPorRegraCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeRelevanciaPorRegraCriarPO = new DeterminacaoDeRelevanciaPorRegraCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = determinacaoDeRelevanciaPorRegraCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}