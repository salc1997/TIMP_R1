package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuraçãoDeCréditoTributárioPIS.ConfiguraçãoEExecução.RegistroM200;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuraçãoDeCréditoTributárioPIS.ConfiguraçãoEExecução.RegistroM200.RegistroM200ExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroM200Excluir extends TestBaseMassiel{
	
	LoginTC loginTC;
	  AcessarTCCPO acessarTCCPO;
	  RegistroM200ExcluirPO registroM200ExcluirPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM200ExcluirPO = new RegistroM200ExcluirPO();
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
	public void excluir() {
 		boolean sucesso = registroM200ExcluirPO.excluir();

		assertTrue(sucesso, Criar);
		
	}


}
