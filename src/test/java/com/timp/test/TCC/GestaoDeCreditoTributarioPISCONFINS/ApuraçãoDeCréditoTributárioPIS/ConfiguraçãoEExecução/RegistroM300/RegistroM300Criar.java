package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.Apura��oDeCr�ditoTribut�rioPIS.Configura��oEExecu��o.RegistroM300;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.Apura��oDeCr�ditoTribut�rioPIS.Configura��oEExecu��o.RegistroM300.RegistroM300CriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroM300Criar extends TestBaseMassiel{
	LoginTC loginTC;
	  AcessarTCCPO acessarTCCPO;
	  RegistroM300CriarPO registroM300CriarPO;
	  
	  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM300CriarPO = new  RegistroM300CriarPO();
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
		
		//registroM300CriarPO.Crear();
		boolean sucesso = registroM300CriarPO.Crear();

		assertTrue(sucesso, Criar);
		
	}
}
