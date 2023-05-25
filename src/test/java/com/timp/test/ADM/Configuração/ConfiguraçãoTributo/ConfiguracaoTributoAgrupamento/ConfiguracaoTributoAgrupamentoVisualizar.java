package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracaoTributoAgrupamentoVisualizar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoTributoAgrupamentoVisualizarPO configuraçãoTributoAgrupamentoVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoAgrupamentoVisualizarPO = new ConfiguracaoTributoAgrupamentoVisualizarPO();
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
	public void visualizar() {

		ArrayList<Boolean> sucesso = configuraçãoTributoAgrupamentoVisualizarPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}
}
