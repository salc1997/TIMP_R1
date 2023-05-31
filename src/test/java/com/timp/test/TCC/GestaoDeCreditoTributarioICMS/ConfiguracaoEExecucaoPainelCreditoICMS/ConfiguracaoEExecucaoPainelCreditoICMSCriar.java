package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS.ConfiguracaoEExecucaoPainelCreditoICMSCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoEExecucaoPainelCreditoICMSCriar extends TestBase {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoPainelCreditoICMSCriarPO configuracaoEExecucaoPainelCreditoICMSCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoPainelCreditoICMSCriarPO = new ConfiguracaoEExecucaoPainelCreditoICMSCriarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}


	@Test()
	public void criar() {

		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuracaoEExecucaoPainelCreditoICMSCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}

}
