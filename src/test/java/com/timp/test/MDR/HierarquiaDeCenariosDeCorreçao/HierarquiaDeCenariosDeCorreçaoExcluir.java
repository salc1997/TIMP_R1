package com.timp.test.MDR.HierarquiaDeCenariosDeCorre�ao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorre�ao.HierarquiaDeCenariosDeCorre�aoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorre�aoExcluir extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorre�aoExcluirPO hierarquiaDeCenariosDeCorre�aoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorre�aoExcluirPO = new HierarquiaDeCenariosDeCorre�aoExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  
  @Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		
		boolean sucesso = hierarquiaDeCenariosDeCorre�aoExcluirPO.Excluir();
		assertTrue(sucesso, semAcesso);

	}

}
