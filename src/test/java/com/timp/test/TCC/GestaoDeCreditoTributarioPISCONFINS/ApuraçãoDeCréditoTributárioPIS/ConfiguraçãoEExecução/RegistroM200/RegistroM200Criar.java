package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.Apura��oDeCr�ditoTribut�rioPIS.Configura��oEExecu��o.RegistroM200;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.Apura��oDeCr�ditoTribut�rioPIS.Configura��oEExecu��o.RegistroM200.RegistroM200CriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroM200Criar extends TestBaseMassiel{
	  LoginTC loginTC;
	  AcessarTCCPO acessarTCCPO;
	  RegistroM200CriarPO registroM200CriarPO;
	  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM200CriarPO = new  RegistroM200CriarPO();
	
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
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
	public void criar() {

		
		boolean sucesso = registroM200CriarPO.Criar();

		assertTrue(sucesso, Criar);
	}
}
