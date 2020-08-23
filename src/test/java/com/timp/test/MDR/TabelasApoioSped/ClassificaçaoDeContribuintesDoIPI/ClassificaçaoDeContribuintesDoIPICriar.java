package com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPICriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ClassificaçaoDeContribuintesDoIPICriar extends TestBaseEliel{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ClassificaçaoDeContribuintesDoIPICriarPO classificaçaoDeContribuintesDoIPICriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classificaçaoDeContribuintesDoIPICriarPO = new ClassificaçaoDeContribuintesDoIPICriarPO();
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

		//classificaçaoDeContribuintesDoIPICriarPO.criar();
		
		boolean sucesso = classificaçaoDeContribuintesDoIPICriarPO.criar();
		assertTrue(sucesso, semAcesso);
		
	}	
	
}
