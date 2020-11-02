package com.timp.test.MDR.TabelasApoioESocial.Tabela24;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela23.FactoresDeRiscoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.Codifica��oDeAcDeTrabEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Codifica��oDeAcDeTrabEditar extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Codifica��oDeAcDeTrabEditarPO codifica��oDeAcDeTrabEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	loginTC = new LoginTC();
	acessarMDRPO = new AcessarMDRPO();
	codifica��oDeAcDeTrabEditarPO = new Codifica��oDeAcDeTrabEditarPO();
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
  public void editar() {

	boolean sucesso = codifica��oDeAcDeTrabEditarPO.editar();

	assertTrue(sucesso, Editar);

  }

}
