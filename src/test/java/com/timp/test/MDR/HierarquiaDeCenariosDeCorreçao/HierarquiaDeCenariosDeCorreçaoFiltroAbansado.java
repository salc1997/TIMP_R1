package com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorre�aoFiltroAbansado extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	HierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO;

  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
      accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO =new HierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}
	@Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	public void Filtro() {
		
		ArrayList<Boolean> empresa = hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO.FiltroA();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}
		
		ArrayList<Boolean> usuario = hierarquiaDeCenariosDeCorre�aoFiltrosAbansadosPO.FiltroB();
		for (int i = 0; i < usuario.size(); i++) {
			assertTrue(usuario.get(i), Filtros);
		}
	}


}
