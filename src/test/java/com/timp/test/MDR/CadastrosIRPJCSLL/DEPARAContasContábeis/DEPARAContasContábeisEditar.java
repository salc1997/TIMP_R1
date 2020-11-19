package com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasCont�beis.DEPARAContasCont�beisEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DEPARAContasCont�beisEditar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	DEPARAContasCont�beisEditarPO dEPARAContasCont�beisEditarPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  dEPARAContasCont�beisEditarPO = new DEPARAContasCont�beisEditarPO();
	  
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
  public void editar() {
	
	  boolean sucesso = dEPARAContasCont�beisEditarPO.Editar();
	  assertTrue(sucesso, Editar);
	  
	}

}
