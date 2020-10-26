package com.timp.test.MDR.ContasEspeciaisIRPJCSLL;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ContasEspeciaisIRPJCSLL.ContasEspeciaisIRPJCSLLPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContasEspeciaisIRPJCSLL extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ContasEspeciaisIRPJCSLLPO  contasEspeciaisIRPJCSLLPO;
	
	
	
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  contasEspeciaisIRPJCSLLPO = new ContasEspeciaisIRPJCSLLPO();
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
	public void criar() {
	  boolean sucesso = contasEspeciaisIRPJCSLLPO.Criar();
	  assertTrue(sucesso, Criar);
	  }
  
 
  
}
