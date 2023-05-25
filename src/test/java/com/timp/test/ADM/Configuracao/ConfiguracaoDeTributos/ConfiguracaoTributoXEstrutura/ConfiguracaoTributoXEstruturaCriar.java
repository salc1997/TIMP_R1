package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoXEstrutura;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoXEstrutura.ConfiguracaoTributoXEstruturaCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoTributoXEstruturaCriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoTributoXEstruturaCriarPO configuraçãoTributoTributoXEstruturaCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoTributoXEstruturaCriarPO = new ConfiguracaoTributoXEstruturaCriarPO();
  }

  @AfterClass
  public void afterClass() {

	  driver.close();
  }

	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configuraçãoTributoTributoXEstruturaCriarPO.criar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		
		boolean sucesso = configuraçãoTributoTributoXEstruturaCriarPO.excluir();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}


}
