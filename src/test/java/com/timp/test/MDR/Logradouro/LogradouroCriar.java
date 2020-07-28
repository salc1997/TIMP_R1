package com.timp.test.MDR.Logradouro;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Logradouro.LogradouroCriarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LogradouroCriar extends TestBaseKathy{
	LoginTC loginTC;
  	AcessarMDRPO acessarMDRPO;
  	LogradouroCriarPO logradouroCriarPO;
  
  	@BeforeClass
  	public void beforeClass() {
	  	driver = initializationK();
	  	loginTC = new LoginTC();
	  	acessarMDRPO = new AcessarMDRPO();
	  	logradouroCriarPO = new LogradouroCriarPO();
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
	public void logradouroCriar() {
		logradouroCriarPO.logradouroCriar();
	}
}
