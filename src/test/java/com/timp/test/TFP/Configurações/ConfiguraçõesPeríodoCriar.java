package com.timp.test.TFP.Configura��es;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configura��es.Configura��esPer�odoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��esPer�odoCriar extends TestBaseMassiel{
	  LoginTC loginTC;
	  AcessarTFPPO acessarTFPPO;
	  Configura��esPer�odoCriarPO  configura��esPer�odoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarTFPPO = new AcessarTFPPO();
	  configura��esPer�odoCriarPO = new Configura��esPer�odoCriarPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void TFPEntrar() {
		 acessarTFPPO .acessarTFP();
	}
	
	@Test(priority = 2)
	public void criar() {
		
		boolean sucesso = configura��esPer�odoCriarPO.criar();

		// teste pra conferir se o resultado mostrado � igual
		assertTrue(sucesso, Criar);

	}
	
	

}
