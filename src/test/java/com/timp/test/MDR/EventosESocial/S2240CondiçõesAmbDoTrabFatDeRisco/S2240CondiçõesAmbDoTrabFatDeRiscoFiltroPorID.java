package com.timp.test.MDR.EventosESocial.S2240Condiš§esAmbDoTrabFatDeRisco;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2240Condiš§esAmbDoTrabFatDeRisco.S2240Condiš§esAmbDoTrabFatDeRiscoFiltroPorIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S2240Condiš§esAmbDoTrabFatDeRiscoFiltroPorID extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S2240Condiš§esAmbDoTrabFatDeRiscoFiltroPorIDPO s2240Condiš§esAmbDoTrabFatDeRiscoFiltroPorIDPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  s2240Condiš§esAmbDoTrabFatDeRiscoFiltroPorIDPO = new S2240Condiš§esAmbDoTrabFatDeRiscoFiltroPorIDPO();
  }

  @AfterClass
 	public void afterClass() {
 		driver.close();
 	}


 	@Test()
	  public void filtroPorId() {
 		
		loginTC.login();

		acessarMDRPO.acessarMDR();
 		 
 		boolean dato = s2240Condiš§esAmbDoTrabFatDeRiscoFiltroPorIDPO.filtroPorId();
		   
		 assertTrue(dato, filtros);
	  }


}
