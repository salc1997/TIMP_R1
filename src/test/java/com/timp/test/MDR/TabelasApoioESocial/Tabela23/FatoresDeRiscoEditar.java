package com.timp.test.MDR.TabelasApoioESocial.Tabela23;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela23.FactoresDeRiscoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatoresDeRiscoEditar extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FactoresDeRiscoEditarPO factoresDeRiscoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	loginTC = new LoginTC();
	acessarMDRPO = new AcessarMDRPO();
	factoresDeRiscoEditarPO = new FactoresDeRiscoEditarPO();
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

	boolean sucesso = factoresDeRiscoEditarPO.editar();

	assertTrue(sucesso, Editar);

  }

}