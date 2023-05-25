package com.timp.test.TFP.Configuracoes.Configuracoes.Periodo;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Periodo.ConfiguracoesPeríodoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesPeríodoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracoesPeríodoEditarPO configuraçõesPeríodoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuraçõesPeríodoEditarPO = new ConfiguracoesPeríodoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = configuraçõesPeríodoEditarPO.editar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}
}
