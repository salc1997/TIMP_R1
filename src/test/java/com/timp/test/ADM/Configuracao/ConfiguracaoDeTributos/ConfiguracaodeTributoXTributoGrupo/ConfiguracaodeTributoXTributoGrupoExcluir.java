package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaodeTributoXTributoGrupoExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaodeTributoXTributoGrupoExcluirPO configuraçãodeTributoXTributoGrupoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoExcluirPO = new ConfiguracaodeTributoXTributoGrupoExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	@Test()
	public void Excluir() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuraçãodeTributoXTributoGrupoExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);

	}
	

}
