package com.timp.test.MDR.IncentivosFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.IncentivosFiscais.IncentivosFiscaisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class IncentivosFiscaisCriar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	IncentivosFiscaisCriarPO incentivosFiscaisCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  incentivosFiscaisCriarPO = new IncentivosFiscaisCriarPO();
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
	  public void CriarIncentivosFiscais() {
		//incentivosFiscaisCriarPO.CriarIncentivosFiscais();
		
		
		boolean sucesso = incentivosFiscaisCriarPO.CriarIncentivosFiscais();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Criar);

		// Teste pra conferir se conseguiu acesssar o sistema
		assertTrue(incentivosFiscaisCriarPO.mostrar.isDisplayed(), semAcesso);
		
	  }
	
}
