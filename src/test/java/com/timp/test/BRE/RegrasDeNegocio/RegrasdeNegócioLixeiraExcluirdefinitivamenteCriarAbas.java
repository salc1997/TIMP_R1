package com.timp.test.BRE.RegrasDeNegocio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParanetrosGerais.RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.RegrasdeNeg�cioLixeiraExcluirdefinitivamenteCriarAbasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeNeg�cioLixeiraExcluirdefinitivamenteCriarAbas extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeNeg�cioLixeiraExcluirdefinitivamenteCriarAbasPO regrasdeNeg�cioLixeiraExcluirdefinitivamenteCriarAbasPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeNeg�cioLixeiraExcluirdefinitivamenteCriarAbasPO = new RegrasdeNeg�cioLixeiraExcluirdefinitivamenteCriarAbasPO();
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
	public void lexeira() {

		boolean sucesso = regrasdeNeg�cioLixeiraExcluirdefinitivamenteCriarAbasPO.lexeira();
		assertTrue(sucesso, Criar);
		sleep(3000);
		boolean sucesso1 = regrasdeNeg�cioLixeiraExcluirdefinitivamenteCriarAbasPO.excluirDefinitivo();
		assertTrue(sucesso1, Criar);

	}
	


}
