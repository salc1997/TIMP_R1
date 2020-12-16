package com.timp.test.TFP.Configurações.Período;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Período.ConfiguraçõesPeríodoVerPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçõesPeríodoVer extends TestBaseMassiel{
	
	  LoginTC loginTC;
	  AcessarTFPPO acessarTFPPO;
	  ConfiguraçõesPeríodoVerPO configuraçõesPeríodoVerPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarTFPPO = new AcessarTFPPO();
	  configuraçõesPeríodoVerPO = new ConfiguraçõesPeríodoVerPO();
	  
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
		
		configuraçõesPeríodoVerPO.Ver();
		//boolean sucesso = configuraçõesPeríodoCriarPO.criar();

		// teste pra conferir se o resultado mostrado é igual
		//assertTrue(sucesso, Criar);

	}

}
