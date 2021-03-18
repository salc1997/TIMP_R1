package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoEditarPO;

public class ConfiguracaoDeTipoTributoEditar extends TestBaseEliel {
 
	LoginTC loginTC; 
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTipoTributoEditarPO configuracaoDeTipoTributoEditarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationE();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeTipoTributoEditarPO = new ConfiguracaoDeTipoTributoEditarPO();
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
	public void editar() {

		
		boolean sucesso = configuracaoDeTipoTributoEditarPO.editar();

		assertTrue(sucesso, Editar);
		
		
	}
 
	
}
