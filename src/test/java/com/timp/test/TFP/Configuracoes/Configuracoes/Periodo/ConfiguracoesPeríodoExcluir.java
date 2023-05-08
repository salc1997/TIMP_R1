package com.timp.test.TFP.Configuracoes.Configuracoes.Periodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Periodo.ConfiguracoesPer�odoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesPer�odoExcluir extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracoesPer�odoExcluirPO configura��esPer�odoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configura��esPer�odoExcluirPO = new ConfiguracoesPer�odoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();

		acessarTFPPO.acessarTFP();

		boolean sucesso = configura��esPer�odoExcluirPO.excluir();
		assertTrue(sucesso, Editar);
	}
}
