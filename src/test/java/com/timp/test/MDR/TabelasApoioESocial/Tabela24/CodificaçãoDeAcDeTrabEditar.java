package com.timp.test.MDR.TabelasApoioESocial.Tabela24;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela23.FactoresDeRiscoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodificaçãoDeAcDeTrabEditar extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodificaçãoDeAcDeTrabEditarPO codificaçãoDeAcDeTrabEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationC();
	loginTC = new LoginTC();
	acessarMDRPO = new AcessarMDRPO();
	codificaçãoDeAcDeTrabEditarPO = new CodificaçãoDeAcDeTrabEditarPO();
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

	boolean sucesso = codificaçãoDeAcDeTrabEditarPO.editar();

	assertTrue(sucesso, Editar);

  }

}
