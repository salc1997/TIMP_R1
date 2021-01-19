package com.timp.test.TCC.BancoDeCreditoExtemporaneo.PainelBCE;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao.PainelBCEConfiguracaoEExecucaoExcecutarPO;

public class PainelBCEConfiguracaoEExecucaoExecutar extends TestBaseEliel{
 
	
	
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelBCEConfiguracaoEExecucaoExcecutarPO painelBCEConfiguracaoEExecucaoExcecutarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelBCEConfiguracaoEExecucaoExcecutarPO = new PainelBCEConfiguracaoEExecucaoExcecutarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
	public void criar() {
		boolean sucesso = painelBCEConfiguracaoEExecucaoExcecutarPO.criar();
		assertTrue(sucesso, "Não foi possível executar");
	}
}
