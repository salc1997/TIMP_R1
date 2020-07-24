package com.timp.test.MDR.Tributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Tributos.TributosCriarPO;
import com.sap.timp.pageObjectModel.MDR.Tributos.TributosEditarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TributosEditar extends TestBaseKathy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TributosEditarPO tributoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationK();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  tributoEditarPO = new TributosEditarPO();
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
  public void tributoEditar() {
	  tributoEditarPO.tributosEditar();
  }

}
