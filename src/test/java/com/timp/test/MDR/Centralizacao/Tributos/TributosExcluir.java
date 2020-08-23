package com.timp.test.MDR.Centralizacao.Tributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TributosExcluir extends TestBaseKathy{
  LoginTC loginTC;
  AcessarMDRPO acessarMDRPO;
  TributosExcluirPO tributosExcluirPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationK();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  tributosExcluirPO = new TributosExcluirPO();
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
  public void tributosExcluir() {
	  boolean sucesso = tributosExcluirPO.tributosExcluir();
	  assertTrue(sucesso,Eliminado);
  }

}
