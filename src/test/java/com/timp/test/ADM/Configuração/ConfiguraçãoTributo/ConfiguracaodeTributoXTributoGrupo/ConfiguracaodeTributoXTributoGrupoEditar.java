package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoEditarPO;

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
	public void Editar() {

		
		boolean sucesso = configuraçãodeTributoXTributoGrupoEditarPO.editar();
		assertTrue(sucesso, Editar);

		
	}
}
