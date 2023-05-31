package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoTributoAgrupamentoEditar extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoTributoAgrupamentoEditarPO configuraçãoTributoAgrupamentoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoAgrupamentoEditarPO = new ConfiguracaoTributoAgrupamentoEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test()
	public void Editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configuraçãoTributoAgrupamentoEditarPO.editar();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}

}
