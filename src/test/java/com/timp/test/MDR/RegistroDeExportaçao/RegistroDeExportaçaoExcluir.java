package com.timp.test.MDR.RegistroDeExportaçao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao.RegistroDeExportaçaoExcluirPO;


public class RegistroDeExportaçaoExcluir extends TestBaseEliel {
	  
	  LoginTC loginTC;
	  AcessarMDRPO acessarMDRPO;
	  RegistroDeExportaçaoExcluirPO registroDeExportaçaoExcluirPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarMDRPO = new AcessarMDRPO();
		  registroDeExportaçaoExcluirPO = new RegistroDeExportaçaoExcluirPO();
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
		  boolean sucesso = registroDeExportaçaoExcluirPO.excluir();
		  assertTrue(sucesso,Eliminado);
	  }
}
