package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoTributoAgrupamentoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoTributoAgrupamentoEditarPO configura��oTributoAgrupamentoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��oTributoAgrupamentoEditarPO = new ConfiguracaoTributoAgrupamentoEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test()
	public void Editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configura��oTributoAgrupamentoEditarPO.editar();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}

}
