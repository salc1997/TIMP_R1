package com.timp.test.MDR.DeterminacaoDeTipoDeCondicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoCriarPO;

public class DeterminacaoDeTipoDeCondicaoCriar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeTipoDeCondicaoCriarPO determinacaoDeTipoDeCondicaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeTipoDeCondicaoCriarPO = new DeterminacaoDeTipoDeCondicaoCriarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = determinacaoDeTipoDeCondicaoCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
