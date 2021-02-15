package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento.ConfiguraçãoTributoAgrupamentoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo.ConfiguraçãodeTributoXTributoGrupoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeTributoXTributoGrupoCriar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãodeTributoXTributoGrupoCriarPO configuraçãodeTributoXTributoGrupoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoCriarPO = new ConfiguraçãodeTributoXTributoGrupoCriarPO();
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

		
		boolean sucesso = configuraçãodeTributoXTributoGrupoCriarPO.criar();
		assertTrue(sucesso, Criar);

		
	}

}
