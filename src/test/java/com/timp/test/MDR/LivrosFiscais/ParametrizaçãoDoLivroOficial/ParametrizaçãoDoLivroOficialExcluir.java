package com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Parametriza��oDoLivroOficialExcluir extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Parametriza��oDoLivroOficialExcluirPO parametriza��oDoLivroOficialExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametriza��oDoLivroOficialExcluirPO = new Parametriza��oDoLivroOficialExcluirPO();
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
	public void acessarMDR() {
		acessarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	public void excluir() {		
		boolean sucesso = parametriza��oDoLivroOficialExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
