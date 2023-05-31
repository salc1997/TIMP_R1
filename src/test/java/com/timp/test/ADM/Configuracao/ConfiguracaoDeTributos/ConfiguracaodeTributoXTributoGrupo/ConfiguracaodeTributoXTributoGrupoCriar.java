package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaodeTributoXTributoGrupoCriar extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaodeTributoXTributoGrupoCriarPO configuraçãodeTributoXTributoGrupoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC(); 
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoCriarPO = new ConfiguracaodeTributoXTributoGrupoCriarPO();
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuraçãodeTributoXTributoGrupoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

		
	}

}
