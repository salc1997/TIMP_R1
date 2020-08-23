package com.timp.test.MDR.ContratoIOF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ContratoIOF.ContratoIOFCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContratoIOFCriar extends TestBaseEliel {
 
	
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContratoIOFCriarPO contraIOFCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contraIOFCriarPO = new ContratoIOFCriarPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {
		boolean sucesso = contraIOFCriarPO.criar();

		assertTrue(sucesso, semAcesso);

		
	}	
	
	
		
}	
	
	
	
	


