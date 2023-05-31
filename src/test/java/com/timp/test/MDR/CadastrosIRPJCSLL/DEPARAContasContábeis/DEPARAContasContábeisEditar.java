package com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DEPARAContasContábeisEditar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	DEPARAContasContábeisEditarPO dEPARAContasContábeisEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  dEPARAContasContábeisEditarPO = new DEPARAContasContábeisEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  


	@Test()
	public void Editar() {
		
		loginTC.login();
		accesarMDRPO.acessarMDR();
		
		//dEPARAContasContábeisCriarPO.Criar();
		  boolean sucesso = dEPARAContasContábeisEditarPO .Editar();
		  assertTrue(sucesso, Criar);
		  sleep(2000);
	  }

}
