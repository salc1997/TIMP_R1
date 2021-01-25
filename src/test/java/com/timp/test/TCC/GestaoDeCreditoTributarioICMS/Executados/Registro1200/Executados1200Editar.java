package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.Executados.Registro1200;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Executados1200Editar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
			loginTC = new LoginTC();
			acessarTCCPO = new AcessarTCCPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
 	public void login() {
 		loginTC.login();

 	}

 	@Test(priority = 1)
 	public void acessarTCC() {
 		acessarTCCPO.acessarTCC();
 	}
 	
 	@Test(priority = 2)
	public void Editar() {
	
		/*boolean sucesso = 	executadosEditarPO.editar();
		assertTrue(sucesso, Criar);*/
	}

}
