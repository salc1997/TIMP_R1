package com.timp.test.MDR.Siscoserv.RegistroRF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF.RegistroRFEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroRFEditar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRFEditarPO  registroRFEditarPO;
	 
  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRFEditarPO = new RegistroRFEditarPO();
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
	public void Editar() {
		
		
		boolean sucesso = registroRFEditarPO.Editar();
		assertTrue(sucesso, Criar);
		

	}
}