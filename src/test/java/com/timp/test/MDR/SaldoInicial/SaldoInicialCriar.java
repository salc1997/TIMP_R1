package com.timp.test.MDR.SaldoInicial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SaldoInicialCriar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialCriarPO saldoIncialCriarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  saldoIncialCriarPO = new SaldoInicialCriarPO();
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
  public void CriarSaldoInicial() {
		//saldoIncialCriarPO.CriarSaldoInicial();
		
		boolean sucesso = saldoIncialCriarPO.CriarSaldoInicial();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Criar);

		// Teste pra conferir se conseguiu acesssar o sistema
		assertTrue(saldoIncialCriarPO.mostrar.isDisplayed(), semAcesso);
  }
}
