package com.timp.test.ADM.Configura��o.Configura��oTributo.ConfiguracaodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentofiltrarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.ConfiguracaodeTributoXTributoGrupo.ConfiguracaodeTributoXTributoGrupoFiltrarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ConfiguracaodeTributoXTributoGrupoFiltrar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaodeTributoXTributoGrupoFiltrarPO configura��odeTributoXTributoGrupoFiltrarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��odeTributoXTributoGrupoFiltrarPO = new ConfiguracaodeTributoXTributoGrupoFiltrarPO();
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

		configura��odeTributoXTributoGrupoFiltrarPO.filtro();

		
	}
}
