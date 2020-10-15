package com.timp.test.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoEditarPO;


public class AssociaçãoEditar extends TestBaseFernando{
  LoginTC loginTC;
  AcessarMDRPO accesarMDRPO;
  AssociaçãoEditarPO associaçãoEditarPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationF();
	  loginTC = new LoginTC();
	  accesarMDRPO = new AcessarMDRPO();
	  associaçãoEditarPO = new AssociaçãoEditarPO();
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
  public void editarAssociação() {
	  //associaçãoEditarPO.editarAssociação();
	  boolean sucesso = associaçãoEditarPO.editarAssociação();
	  assertTrue(sucesso, Editar);
  }
}
