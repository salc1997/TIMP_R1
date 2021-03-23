package com.timp.test.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentofiltrarPO;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oTributo.Configura��odeTributoXTributoGrupo.Configura��odeTributoXTributoGrupoFiltrarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Configura��odeTributoXTributoGrupoFiltrar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��odeTributoXTributoGrupoFiltrarPO configura��odeTributoXTributoGrupoFiltrarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��odeTributoXTributoGrupoFiltrarPO = new Configura��odeTributoXTributoGrupoFiltrarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
 
	@Test()
	public void filtros() {
		loginTC.login();
		acessarADMPO.acessarADM();
		configura��odeTributoXTributoGrupoFiltrarPO.filtro();

		
	}
}
