package com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class NotasDeclararAnexoIIIEditar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	NotasDeclararAnexoIIIEditarPO notasDeclararAnexoIIIEditarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  notasDeclararAnexoIIIEditarPO = new NotasDeclararAnexoIIIEditarPO();
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
	
	//  notasDeclararAnexoIIIEditarPO.Editar();
	  boolean sucesso = notasDeclararAnexoIIIEditarPO.Editar();
	  assertTrue(sucesso, Editar);
	  
	}

}
