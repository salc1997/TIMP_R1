package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoFiltrarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaodeTributoXTributoGrupoFiltrar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaodeTributoXTributoGrupoFiltrarPO configuraçãodeTributoXTributoGrupoFiltrarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoFiltrarPO = new ConfiguracaodeTributoXTributoGrupoFiltrarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
 
	@Test()
	public void filtros() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configuraçãodeTributoXTributoGrupoFiltrarPO.filtro();

		assertTrue(sucesso, Eliminado);
		
		sleep(2000);

		
	}
}
