package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo.ConfiguracaoDeTributoGrupoCriarPO;

public class ConfiguracaoDeTributoGrupoCriar extends TestBaseEliel{
  
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributoGrupoCriarPO configuracaoDeTributoGrupoCriarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationE();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeTributoGrupoCriarPO = new ConfiguracaoDeTributoGrupoCriarPO();
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

		
		boolean sucesso = configuracaoDeTributoGrupoCriarPO.criar();

		assertTrue(sucesso, Criar);
		
		
	}
	
}
