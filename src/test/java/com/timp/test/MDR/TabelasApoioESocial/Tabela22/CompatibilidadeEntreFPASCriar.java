package com.timp.test.MDR.TabelasApoioESocial.Tabela22;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CompatibilidadeEntreFPASCriar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CompatibilidadeEntreFPASCriarPO compatibilidadeEntreFPASCriarFPASCriarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  compatibilidadeEntreFPASCriarFPASCriarPO = new  CompatibilidadeEntreFPASCriarPO();
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
	  public void criarCompatibilidadeEntreFPAS() {
			 boolean sucesso = compatibilidadeEntreFPASCriarFPASCriarPO.criarCompatibilidadeEntreFPAS();
			  assertTrue(sucesso, Criar);
	  }
}
