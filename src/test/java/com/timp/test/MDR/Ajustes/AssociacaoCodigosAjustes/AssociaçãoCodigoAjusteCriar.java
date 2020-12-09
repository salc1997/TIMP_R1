package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteCriarPO;


public class AssociaçãoCodigoAjusteCriar extends TestBaseFernando{
  LoginTC loginTC;
  AcessarMDRPO accesarMDRPO;
  AssociaçãoCodigoAjusteCriarPO associaçãoCodigoAjusteCriarPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationF();
	  loginTC = new LoginTC();
	  accesarMDRPO = new AcessarMDRPO();
	  associaçãoCodigoAjusteCriarPO = new AssociaçãoCodigoAjusteCriarPO();
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
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
  public void criarAssociaçãoCodigoAjuste() {
	  boolean sucesso = associaçãoCodigoAjusteCriarPO.criarAssociaçãoCodigoAjusteCriar();
	  assertTrue(sucesso, Criar);
  }
}
