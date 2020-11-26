package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;

public class ParametrosParaLivroICMSSTCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaLivroICMSSTCriarPO parametrosParaLivroICMSSTCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaLivroICMSSTCriarPO = new ParametrosParaLivroICMSSTCriarPO();
	}

	@AfterClass
	public void afterClass() {
	
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

		boolean sucesso = parametrosParaLivroICMSSTCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
	

}
