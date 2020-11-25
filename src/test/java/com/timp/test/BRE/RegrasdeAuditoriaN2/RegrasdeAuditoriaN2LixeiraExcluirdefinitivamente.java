package com.timp.test.BRE.RegrasdeAuditoriaN2;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasDeAuditoriaN2CriarCaminhosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN2LixeiraExcluirdefinitivamente extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO regrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO = new RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO();
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

		boolean sucesso = regrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO.lexeira();
		assertTrue(sucesso, Criar);
		sleep(3000);
		boolean sucesso1 = regrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO.excluirDefinitivo();
		assertTrue(sucesso1, Criar);

	}
	

}
