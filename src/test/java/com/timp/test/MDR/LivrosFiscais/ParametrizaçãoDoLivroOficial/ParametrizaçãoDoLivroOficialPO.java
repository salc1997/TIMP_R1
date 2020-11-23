package com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class Parametriza��oDoLivroOficialPO extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Parametriza��oDoLivroOficial parametriza��oDoLivroOficialPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametriza��oDoLivroOficialPO = new Parametriza��oDoLivroOficial();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
	public void criar() {		
		parametriza��oDoLivroOficialPO.criar();
	}
}
