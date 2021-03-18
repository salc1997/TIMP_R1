package com.timp.test.ADM.Configura��o.ConfiguracaoDeTributos.ConfiguracaoDeMapeamentoDeTributo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.ConfiguracaoDeTributos.ConfiguracaoDeMapeamentoDeTributo.ConfiguracaoDeMapeamentoDeTributoCriarPO;

public class ConfiguracaoDeMapeamentoDeTributoCriar extends TestBaseEliel{
 
	 
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeMapeamentoDeTributoCriarPO configuracaoDeMapeamentoDeTributoCriarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationE();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeMapeamentoDeTributoCriarPO = new ConfiguracaoDeMapeamentoDeTributoCriarPO();
  }

  @AfterClass
  public void afterClass() {
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

		
		boolean sucesso = configuracaoDeMapeamentoDeTributoCriarPO.criar();

		assertTrue(sucesso, Criar);
		
		
	}
}
