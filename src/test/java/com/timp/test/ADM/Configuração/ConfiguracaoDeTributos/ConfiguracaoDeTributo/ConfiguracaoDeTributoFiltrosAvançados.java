package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo.ConfiguracaoDeTributosFiltrosAvançadosPO;

public class ConfiguracaoDeTributoFiltrosAvançados extends TestBaseEliel{
  
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributosFiltrosAvançadosPO configuracaoDeTributosFiltrosAvançadosPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationE();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuracaoDeTributosFiltrosAvançadosPO = new ConfiguracaoDeTributosFiltrosAvançadosPO();
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
	public void filtro() {

		
		ArrayList<Boolean> sucesso = configuracaoDeTributosFiltrosAvançadosPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
		
	}
	
}
