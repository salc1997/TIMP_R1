package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo.ConfiguraçãodeTributoXTributoGrupoEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo.ConfiguraçãodeTributoXTributoGrupoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeTributoXTributoGrupoExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãodeTributoXTributoGrupoExcluirPO configuraçãodeTributoXTributoGrupoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoExcluirPO = new ConfiguraçãodeTributoXTributoGrupoExcluirPO();
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
	public void Excluir() {

		boolean sucesso = configuraçãodeTributoXTributoGrupoExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
	}
	

}
