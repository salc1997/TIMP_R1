package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento.ConfiguracaoTributoAgrupamentofiltrarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracaoTributoAgrupamentofiltrar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoTributoAgrupamentofiltrarPO configuraçãoTributoAgrupamentofiltrarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoAgrupamentofiltrarPO = new ConfiguracaoTributoAgrupamentofiltrarPO();
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }
  
  

	@Test()
	public void filtros() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuraçãoTributoAgrupamentofiltrarPO.filtro();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}

}
