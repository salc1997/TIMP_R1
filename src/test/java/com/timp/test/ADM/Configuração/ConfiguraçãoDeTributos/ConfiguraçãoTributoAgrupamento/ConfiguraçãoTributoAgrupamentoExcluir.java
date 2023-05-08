package com.timp.test.ADM.Configuração.ConfiguraçãoDeTributos.ConfiguraçãoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoDeTributos.ConfiguraçãoTributoAgrupamento.ConfiguraçãoTributoAgrupamentoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãoTributoAgrupamentoExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãoTributoAgrupamentoExcluirPO configuraçãoTributoAgrupamentoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoAgrupamentoExcluirPO = new ConfiguraçãoTributoAgrupamentoExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test()
	public void Excluir() {

		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configuraçãoTributoAgrupamentoExcluirPO.excluir();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}

}
