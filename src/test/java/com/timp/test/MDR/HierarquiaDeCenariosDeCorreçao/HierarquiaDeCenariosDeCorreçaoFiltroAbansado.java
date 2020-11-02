package com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorreçaoFiltroAbansado extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO;

  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
      accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO =new HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO();
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
		
		ArrayList<Boolean> empresa = hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO.FiltroA();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}
		
		ArrayList<Boolean> usuario = hierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO.FiltroB();
		for (int i = 0; i < usuario.size(); i++) {
			assertTrue(usuario.get(i), Filtros);
		}
	}


}
