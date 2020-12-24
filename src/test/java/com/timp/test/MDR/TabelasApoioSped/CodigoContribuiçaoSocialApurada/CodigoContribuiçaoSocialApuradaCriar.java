package com.timp.test.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.Classifica�aoDeContribuintesDoIPI.Classifica�aoDeContribuintesDoIPICriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribui�aoSocialApurada.CodigoContribuicaoSocialApuradaCriarPO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

public class CodigoContribui�aoSocialApuradaCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContribuicaoSocialApuradaCriarPO codigoContribuicaoSocialApuradaCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContribuicaoSocialApuradaCriarPO = new CodigoContribuicaoSocialApuradaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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

		boolean sucesso = codigoContribuicaoSocialApuradaCriarPO.criar();

		assertTrue(sucesso, Criar);

	}

}
