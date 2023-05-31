package com.timp.test.TFP.Configuracoes.Status.Periodo;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Status.Periodo.ConfiguracoesStatusPeriodoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracoesStatusPeriodoCriar extends TestBase {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracoesStatusPeriodoCriarPO configuracoesStatusPeriodoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuracoesStatusPeriodoCriarPO = new ConfiguracoesStatusPeriodoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void criar() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();

		boolean sucesso = configuracoesStatusPeriodoCriarPO.criar();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Criar);

	}
}
