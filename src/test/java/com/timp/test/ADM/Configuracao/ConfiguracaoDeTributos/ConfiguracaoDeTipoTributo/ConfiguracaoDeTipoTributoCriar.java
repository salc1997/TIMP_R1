
package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoCriarPO;

public class ConfiguracaoDeTipoTributoCriar extends TestBase {
	
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTipoTributoCriarPO configuracaoDeTipoTributoCriarPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC(); 
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeTipoTributoCriarPO = new ConfiguracaoDeTipoTributoCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoDeTipoTributoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

	}
 
}

