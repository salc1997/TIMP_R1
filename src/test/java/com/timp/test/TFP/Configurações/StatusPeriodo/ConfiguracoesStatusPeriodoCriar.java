package com.timp.test.TFP.Configurações.StatusPeriodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.StatusPeriodo.ConfiguracoesStatusPeriodoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracoesStatusPeriodoCriar extends TestBaseKenssy {
	 LoginTC loginTC;
	 AcessarTFPPO acessarTFPPO;
	 ConfiguracoesStatusPeriodoCriarPO  configuracoesStatusPeriodoCriarPO;
	
	@BeforeClass
	public void beforeClass() { 
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarTFPPO = new AcessarTFPPO();
	  configuracoesStatusPeriodoCriarPO = new ConfiguracoesStatusPeriodoCriarPO();
	}

	@AfterClass
	public void afterClass() {
	}
	
	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void TFPEntrar() {
		 acessarTFPPO .acessarTFP();
	}
	
	@Test(priority = 2)
	public void criar() {
		
		boolean sucesso = configuracoesStatusPeriodoCriarPO.criar();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Criar);

	}
}
