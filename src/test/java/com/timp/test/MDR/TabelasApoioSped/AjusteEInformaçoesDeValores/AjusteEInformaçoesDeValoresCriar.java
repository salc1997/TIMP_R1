package com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Informa�oesAdicionais.Informa�oesAdicionaisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjusteEInforma�oesDeValoresCriar extends TestBaseEliel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInforma�oesDeValoresCriarPO ajusteEInforma�oesDeValoresCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInforma�oesDeValoresCriarPO = new AjusteEInforma�oesDeValoresCriarPO();
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

		// ajusteEInforma�oesDeValoresCriarPO.criar();

		boolean sucesso = ajusteEInforma�oesDeValoresCriarPO.criar();
		;
		assertTrue(sucesso, semAcesso);

	}

}
