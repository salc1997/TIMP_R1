package com.timp.test.ADM.Configura��o.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.ConfiguracaoDeTributos.ConfiguracaoDeTributo.ConfiguracaoDeTributoVisualizarPO;

public class ConfiguracaoDeTributoVisualizar extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributoVisualizarPO configuracaoDeTributoVisualizarPO ;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationE();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeTributoVisualizarPO = new ConfiguracaoDeTributoVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
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
	public void Visualizar() {

		
		ArrayList<Boolean> sucesso = configuracaoDeTributoVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		
	}
	
	
}
