package com.timp.test.ADM.Configuração.ConfiguraçãoDeTributos.ConfiguraçãoTributoXEstrutura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoDeTributos.ConfiguraçãoTributoXEstrutura.ConfiguraçãoTributoXEstruturaCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãoTributoXEstruturaCriar extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãoTributoXEstruturaCriarPO configuraçãoTributoTributoXEstruturaCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoTributoXEstruturaCriarPO = new ConfiguraçãoTributoXEstruturaCriarPO();
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
