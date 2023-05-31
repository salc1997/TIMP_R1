package com.timp.test.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher.CodigosDasObrigaçoesDeICMSaRecolherCriarPO;

public class CodigosDasObrigaçoesDeICMSaRecolherCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigosDasObrigaçoesDeICMSaRecolherCriarPO codigosDasObrigaçoesDeICMSaRecolherCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigosDasObrigaçoesDeICMSaRecolherCriarPO = new CodigosDasObrigaçoesDeICMSaRecolherCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigosDasObrigaçoesDeICMSaRecolherCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
