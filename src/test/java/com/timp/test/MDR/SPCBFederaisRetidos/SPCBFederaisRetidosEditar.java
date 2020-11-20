package com.timp.test.MDR.SPCBFederaisRetidos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SPCBFederaisRetidosEditar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SPCBFederaisRetidosEditarPO sPCBFederaisRetidosEditarPO;

  @BeforeClass
  public void beforeClass() {
	  	driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		sPCBFederaisRetidosEditarPO = new SPCBFederaisRetidosEditarPO();
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

	boolean sucesso = sPCBFederaisRetidosEditarPO.editar();

	assertTrue(sucesso, Editar);

  }


}
