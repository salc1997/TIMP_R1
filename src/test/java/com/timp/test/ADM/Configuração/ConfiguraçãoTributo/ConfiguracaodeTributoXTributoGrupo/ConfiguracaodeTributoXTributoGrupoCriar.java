package com.timp.test.ADM.Configura��o.Configura��oTributo.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaodeTributoXTributoGrupoCriar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaodeTributoXTributoGrupoCriarPO configura��odeTributoXTributoGrupoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��odeTributoXTributoGrupoCriarPO = new ConfiguracaodeTributoXTributoGrupoCriarPO();
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

		
		boolean sucesso = configura��odeTributoXTributoGrupoCriarPO.criar();
		assertTrue(sucesso, Criar);

		
	}

}
