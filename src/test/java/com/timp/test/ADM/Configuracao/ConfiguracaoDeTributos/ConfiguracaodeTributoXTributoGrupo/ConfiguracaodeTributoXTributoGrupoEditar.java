package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaodeTributoXTributoGrupoEditar extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaodeTributoXTributoGrupoEditarPO configuraçãodeTributoXTributoGrupoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoEditarPO = new ConfiguracaodeTributoXTributoGrupoEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void Editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuraçãodeTributoXTributoGrupoEditarPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);

		
	}
}
