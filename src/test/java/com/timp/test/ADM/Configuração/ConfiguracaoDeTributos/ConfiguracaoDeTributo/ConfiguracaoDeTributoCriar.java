package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo.ConfiguracaoDeTributoCriarPO;

public class ConfiguracaoDeTributoCriar extends TestBaseEliel {
  
	
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributoCriarPO configuracaoDeTributoCriarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationE();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeTributoCriarPO = new ConfiguracaoDeTributoCriarPO();
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
	public void AcessarADM() {

		acessarADMPO.acessarADM();
		
	}
	
	@Test(priority = 2)
	public void criar() {

		
		boolean sucesso = configuracaoDeTributoCriarPO.criar();

		assertTrue(sucesso, Criar);
		
		
	}
}
