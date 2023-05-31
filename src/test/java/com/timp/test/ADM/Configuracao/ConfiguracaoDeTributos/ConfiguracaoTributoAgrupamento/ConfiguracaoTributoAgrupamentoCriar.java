package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracaoTributoAgrupamentoCriar extends TestBase{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoTributoAgrupamentoCriarPO configuraçãoTributoAgrupamentoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoAgrupamentoCriarPO = new ConfiguracaoTributoAgrupamentoCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void criar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuraçãoTributoAgrupamentoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}

}
