package com.timp.test.MDR.Centralizacao.Saldos;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos.SaldosCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SaldosCriar extends TestBase{
  
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldosCriarPO saldosCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  saldosCriarPO = new SaldosCriarPO();
		
  }

  
	@AfterClass
	public void afterClass() {
		//driver.close();
	}


  
	@Test()
	public void CriarSaldo() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = saldosCriarPO.CriarSaldo();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}
}
