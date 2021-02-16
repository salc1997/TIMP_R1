package com.timp.test.TCM.Configuracao.ModeloDeDados;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCM.AcessarTCMPO;
import com.sap.timp.pageObjectModel.TCM.Configuracao.ModeloDeDados.ConfiguracaoModeloDeDadosCriarPO;
import com.sap.timp.pageObjectModel.TCM.Configuracao.ModeloDeDados.ConfiguracaoModeloDeDadosEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoModeloDeDadosEditar extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTCMPO acessarTCMPO;
	ConfiguracaoModeloDeDadosEditarPO configuracaoModeloDeDadosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCMPO = new AcessarTCMPO();
		configuracaoModeloDeDadosEditarPO = new ConfiguracaoModeloDeDadosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void acessarTCM() {
		acessarTCMPO.acessarTCM();
	}

	@Test(priority = 2)
	public void editar() {
		boolean sucesso = configuracaoModeloDeDadosEditarPO.editar();
		assertTrue(sucesso, Editar);
	}

}
