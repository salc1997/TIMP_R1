package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuraçãoDeCréditoTributárioPIS.ConfiguraçãoEExecução.RegistroM230;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuraçãoDeCréditoTributárioPIS.ConfiguraçãoEExecução.RegistroM230.RegistroM230CrearPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroM230Crear extends TestBaseMassiel{
	LoginTC loginTC;
	  AcessarTCCPO acessarTCCPO;
	  RegistroM230CrearPO registroM230CrearPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM230CrearPO = new RegistroM230CrearPO();
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
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
		
		
		boolean sucesso = registroM230CrearPO.Crear();

		assertTrue(sucesso, Criar);
		
	}
}
