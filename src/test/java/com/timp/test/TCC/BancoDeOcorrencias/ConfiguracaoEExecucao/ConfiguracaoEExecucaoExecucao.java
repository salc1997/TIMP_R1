package com.timp.test.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.ConfiguracaoEExecucaoExecutarPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao.ConfiguracaoEExecucaoCriarPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao.ConfiguracaoEExecucaoExecucaoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoEExecucaoExecucao extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoExecucaoPO configuracaoEExecucaoExecucaoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoExecucaoPO = new ConfiguracaoEExecucaoExecucaoPO();
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
	public void acessarTCC() {

		acessarTCCPO.acessarTCC();

	}

	@Test(priority = 2)
	public void executarr() {

		boolean sucesso = configuracaoEExecucaoExecucaoPO.executar();

		assertTrue(sucesso, Criar);
	}

}
