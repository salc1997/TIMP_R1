package com.timp.test.MDR.ThinCapitalization.Emprestimos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ThinCapitalization.Emprestimos.EmprestimosExcluirPO;

public class EmprestimosExcluir extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	EmprestimosExcluirPO emprestimosExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  emprestimosExcluirPO = new EmprestimosExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test(priority = 0)
  public void ingresar() {
	  loginTC.login();
  }
  
  @Test(priority = 1)
  public void mdrEntrar() {
	 accesarMDR.acessarMDR();

  }
  
  @Test(priority = 2)
  public void editarEmprestimos() {
	  boolean sucesso = emprestimosExcluirPO.excluirEmprestimos();
	  assertTrue(sucesso, Editar);
  }
}