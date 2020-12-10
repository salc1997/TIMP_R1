package com.timp.test.TFP.Configura��es.Per�odo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configura��es.Per�odo.Configura��esPer�odoVerPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��esPer�odoVer extends TestBaseMassiel{
	
	  LoginTC loginTC;
	  AcessarTFPPO acessarTFPPO;
	  Configura��esPer�odoVerPO configura��esPer�odoVerPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarTFPPO = new AcessarTFPPO();
	  configura��esPer�odoVerPO = new Configura��esPer�odoVerPO();
	  
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
		
		configura��esPer�odoVerPO.Ver();
		//boolean sucesso = configura��esPer�odoCriarPO.criar();

		// teste pra conferir se o resultado mostrado � igual
		//assertTrue(sucesso, Criar);

	}

}
