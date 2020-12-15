package com.timp.test.BRE.RegrasDeNegocio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParanetrosGerais.RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.RegrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbas extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO regrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO = new RegrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO();
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

		boolean sucesso = regrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO.lexeira();
		assertTrue(sucesso, Criar);
		sleep(3000);
		boolean sucesso1 = regrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO.excluirDefinitivo();
		assertTrue(sucesso1, Criar);

	}
	


}
