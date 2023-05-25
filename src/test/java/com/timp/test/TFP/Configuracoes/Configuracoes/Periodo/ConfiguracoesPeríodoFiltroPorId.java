package com.timp.test.TFP.Configuracoes.Configuracoes.Periodo;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Periodo.ConfiguracoesPeríodoFiltroPorIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesPeríodoFiltroPorId extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracoesPeríodoFiltroPorIdPO configuraçõesPeríodoFiltroPorIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuraçõesPeríodoFiltroPorIdPO = new ConfiguracoesPeríodoFiltroPorIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {
		loginTC.login();

		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = configuraçõesPeríodoFiltroPorIdPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}

	}

}
