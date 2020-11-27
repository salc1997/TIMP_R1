package com.timp.test.BRE;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeNeg�cioExcluirdefinitivamentePO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasDeAuditoriaN2CriarCaminhosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeNeg�cioExcluirdefinitivamente extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeNeg�cioExcluirdefinitivamentePO regrasdeNeg�cioExcluirdefinitivamentePO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeNeg�cioExcluirdefinitivamentePO = new RegrasdeNeg�cioExcluirdefinitivamentePO();
  }

  
  @AfterClass
  public void afterClass() {
	  
  }

  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarBRE() {

		acessarBREPO.acessarBRE();

	}
	@Test(priority = 2)
	public void criar() {

		boolean sucesso = regrasdeNeg�cioExcluirdefinitivamentePO.criar();
		assertTrue(sucesso, Criar);
		sleep(3000);
		boolean sucesso2 = regrasdeNeg�cioExcluirdefinitivamentePO.lexeira();
		assertTrue(sucesso2, Criar);
		sleep(3000);
		boolean sucesso1 = regrasdeNeg�cioExcluirdefinitivamentePO.excluirDefinitivo();
		assertTrue(sucesso1, Criar);

	}

}
