package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.Associa��oEditarPO;


public class Associa��oEditar extends TestBaseFernando{
  LoginTC loginTC;
  AcessarMDRPO accesarMDRPO;
  Associa��oEditarPO associa��oEditarPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationF();
	  loginTC = new LoginTC();
	  accesarMDRPO = new AcessarMDRPO();
	  associa��oEditarPO = new Associa��oEditarPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
  public void login() {
	  loginTC.login();
  }
  
  @Test(priority = 1)
  public void ingresarMDR() {
	  accesarMDRPO.acessarMDR();
  }
  
  @Test(priority = 2)
  public void editarAssocia��o() {
	  //associa��oEditarPO.editarAssocia��o();
	  boolean sucesso = associa��oEditarPO.editarAssocia��o();
	  assertTrue(sucesso, Editar);
  }
}
