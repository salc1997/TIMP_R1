package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoTributoAgrupamentoExcluir extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoTributoAgrupamentoExcluirPO configuraçãoTributoAgrupamentoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoAgrupamentoExcluirPO = new ConfiguracaoTributoAgrupamentoExcluirPO();
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
