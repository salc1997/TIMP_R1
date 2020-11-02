package com.timp.test.MDR.ThinCapitalization.Emprestimos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ThinCapitalization.Emprestimos.EmprestimosCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EmprestimosCriar extends TestBaseKenssy  {
  
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EmprestimosCriarPO emprestimosCriarPO;

	@BeforeClass
	public void beforeClass() {
		  driver = initializationKen();
		  loginTC = new LoginTC();
		  acessarMDRPO = new AcessarMDRPO();
		  emprestimosCriarPO = new EmprestimosCriarPO();
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
	  public void criarEmprestimos() {
		
		boolean sucesso = emprestimosCriarPO.CriarEmprestimos();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Criar);

		// Teste pra conferir se conseguiu acesssar o sistema
		assertTrue(emprestimosCriarPO.mostrar.isDisplayed(), semAcesso);
	  }
}
