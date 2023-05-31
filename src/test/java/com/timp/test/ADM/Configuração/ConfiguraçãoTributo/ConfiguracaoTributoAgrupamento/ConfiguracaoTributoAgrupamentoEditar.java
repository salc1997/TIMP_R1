package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaoTributoAgrupamento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoEditarPO;

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
	public void Editar() {

		
		boolean sucesso = configuraçãoTributoAgrupamentoEditarPO.editar();
		assertTrue(sucesso, Editar);

		
	}

}
