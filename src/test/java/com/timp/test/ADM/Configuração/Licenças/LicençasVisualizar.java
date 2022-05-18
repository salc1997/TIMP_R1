package com.timp.test.ADM.Configuração.Licenças;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.Licenças.LicençasVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LicençasVisualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	LicençasVisualizarPO licençasVisualizarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  licençasVisualizarPO = new LicençasVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test
	public void visualizar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		
		ArrayList<Boolean> sucesso = licençasVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(2000);
	}

}
