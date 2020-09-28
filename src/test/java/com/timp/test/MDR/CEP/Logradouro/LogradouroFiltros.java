package com.timp.test.MDR.CEP.Logradouro;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Logradouro.LogradouroFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class LogradouroFiltros extends TestBaseKathy{
	LoginTC loginTC;
  	AcessarMDRPO acessarMDRPO;
  	LogradouroFiltrosPO logradouroFiltrosPO;
  
  	@BeforeClass
  	public void beforeClass() {
	  	driver = initializationK();
	  	loginTC = new LoginTC();
	  	acessarMDRPO = new AcessarMDRPO();
	  	logradouroFiltrosPO = new LogradouroFiltrosPO();
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
	public void filtros() {
		boolean sucesso =  logradouroFiltrosPO.logradouroFiltros();
		assertTrue(sucesso, Filtros);
	}
}
