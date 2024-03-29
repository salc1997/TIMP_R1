package com.timp.test.MDR.TabelasApoioESocial.Tabela04;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASCriarPO;

public class CodigosEAliqDeFPRASCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigosEAliqDeFPRASCriarPO codigosEAliqDeFPRASCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigosEAliqDeFPRASCriarPO = new CodigosEAliqDeFPRASCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = codigosEAliqDeFPRASCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}
