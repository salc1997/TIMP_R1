package com.timp.test.TFP.Configuracoes.Configuracoes.Periodo;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Periodo.ConfiguracoesPeríodoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesPeríodoExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracoesPeríodoExcluirPO configuraçõesPeríodoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuraçõesPeríodoExcluirPO = new ConfiguracoesPeríodoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();

		acessarTFPPO.acessarTFP();

		boolean sucesso = configuraçõesPeríodoExcluirPO.excluir();
		assertTrue(sucesso, Editar);
	}
}
