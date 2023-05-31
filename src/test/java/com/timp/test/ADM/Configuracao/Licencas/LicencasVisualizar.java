package com.timp.test.ADM.Configuracao.Licencas;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.Licencas.LicencasVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LicencasVisualizar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	LicencasVisualizarPO licençasVisualizarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  licençasVisualizarPO = new LicencasVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test
	public void visualizar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		
		ArrayList<Boolean> sucesso = licençasVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}

}
