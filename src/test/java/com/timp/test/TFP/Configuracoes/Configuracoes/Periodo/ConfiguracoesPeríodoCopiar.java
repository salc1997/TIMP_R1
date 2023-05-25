package com.timp.test.TFP.Configuracoes.Configuracoes.Periodo;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Periodo.ConfiguracoesPeríodoCopiarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesPeríodoCopiar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracoesPeríodoCopiarPO configuraçõesPeríodoCopiarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuraçõesPeríodoCopiarPO = new ConfiguracoesPeríodoCopiarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void copiar() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		boolean sucesso = configuraçõesPeríodoCopiarPO.copiar();
		assertTrue(sucesso, Editar);

	}

}
