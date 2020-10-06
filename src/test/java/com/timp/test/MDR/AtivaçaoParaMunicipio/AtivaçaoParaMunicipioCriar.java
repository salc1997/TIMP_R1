package com.timp.test.MDR.Ativa�aoParaMunicipio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioCriarPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Ativa�aoParaMunicipioCriar extends TestBaseEliel {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Ativa�aoParaMunicipioCriarPO ativa�aoParaMunicipioCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativa�aoParaMunicipioCriarPO = new Ativa�aoParaMunicipioCriarPO();
	}
	
	  @AfterClass public void afterClass(){ driver.close(); }


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
		
		
		boolean sucesso = ativa�aoParaMunicipioCriarPO.criar();
		assertTrue(sucesso, semAcesso);
		
	}		
}
