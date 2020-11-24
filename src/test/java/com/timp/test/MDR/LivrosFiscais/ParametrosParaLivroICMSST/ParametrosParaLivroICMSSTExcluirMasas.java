package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosParaLivroICMSSTExcluirMasas extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaLivroICMSSTExcluirMasasPO parametrosParaLivroICMSSTExcluirMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaLivroICMSSTExcluirMasasPO = new ParametrosParaLivroICMSSTExcluirMasasPO();
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
	public void criar() {
		
		
		boolean sucesso = parametrosParaLivroICMSSTExcluirMasasPO.criar();
		assertTrue(sucesso, Criar);
		
		boolean sucesso2 = parametrosParaLivroICMSSTExcluirMasasPO.ParametrosParaLivroICMSSTExcluirMasas();
		assertTrue(sucesso2, Eliminado);
	}
	
}
