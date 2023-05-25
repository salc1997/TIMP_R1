package com.timp.test.TCM.Configuracao.ModeloDeDados;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCM.AcessarTCMPO;
import com.sap.timp.pageObjectModel.TCM.Configuracao.ModeloDeDados.ConfiguracaoModeloDeDadosCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoModeloDeDadosCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCMPO acessarTCMPO;
	ConfiguracaoModeloDeDadosCriarPO configuracaoModeloDeDadosCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCMPO = new AcessarTCMPO();
		configuracaoModeloDeDadosCriarPO = new ConfiguracaoModeloDeDadosCriarPO();
	}

	@AfterClass
	public void afterClass() {
//	driver.close();
	}

	@Test(priority = 1)
	public void criar() {

		loginTC.login();

		acessarTCMPO.acessarTCM();

		boolean sucesso = configuracaoModeloDeDadosCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
