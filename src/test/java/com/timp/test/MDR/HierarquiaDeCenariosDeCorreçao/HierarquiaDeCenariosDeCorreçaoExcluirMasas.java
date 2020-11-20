package com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorreçaoExcluirMasas extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorreçaoExcluirMasasPO hierarquiaDeCenariosDeCorreçaoExcluirMasasPO;
 
  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorreçaoExcluirMasasPO = new HierarquiaDeCenariosDeCorreçaoExcluirMasasPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {
		
		
		boolean sucesso = hierarquiaDeCenariosDeCorreçaoExcluirMasasPO.criar();
		assertTrue(sucesso, Criar);
		
		boolean sucesso2 = hierarquiaDeCenariosDeCorreçaoExcluirMasasPO.HierarquiaDeCenariosDeCorreçaoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
	}

}
