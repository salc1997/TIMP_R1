package com.timp.test.MDR.CEP.Logradouro;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Logradouro.LogradouroVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class LogradouroVisualizar extends TestBaseKathy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LogradouroVisualizarPO logradouroVisualizarPO;
  
	@BeforeClass
	public void beforeClass() {
		driver = initializationK();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		logradouroVisualizarPO = new LogradouroVisualizarPO();
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
	public void logradouroVisualizar() {
		 String sucesso = logradouroVisualizarPO.logradouroVisualizar();		 
		 assertEquals(sucesso, "edit", visualiza�ar);
	}
}
