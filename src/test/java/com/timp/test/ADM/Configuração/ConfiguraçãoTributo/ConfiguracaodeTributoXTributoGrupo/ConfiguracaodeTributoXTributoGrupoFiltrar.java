package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentofiltrarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoFiltrarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ConfiguracaodeTributoXTributoGrupoFiltrar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaodeTributoXTributoGrupoFiltrarPO configuraçãodeTributoXTributoGrupoFiltrarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoFiltrarPO = new ConfiguracaodeTributoXTributoGrupoFiltrarPO();
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
	public void filtros() {

		configuraçãodeTributoXTributoGrupoFiltrarPO.filtro();

		
	}
}
