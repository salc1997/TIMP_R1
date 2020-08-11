package com.timp.test.MDR.RegistroDeExporta�ao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoExcluirPO;


public class RegistroDeExporta�aoExcluir extends TestBaseEliel {
	  
	  LoginTC loginTC;
	  AcessarMDRPO acessarMDRPO;
	  RegistroDeExporta�aoExcluirPO registroDeExporta�aoExcluirPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarMDRPO = new AcessarMDRPO();
		  registroDeExporta�aoExcluirPO = new RegistroDeExporta�aoExcluirPO();
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
	  public void Excluir() {
		  boolean sucesso = registroDeExporta�aoExcluirPO.excluir();
		  assertTrue(sucesso,Eliminado);
	  }
}
