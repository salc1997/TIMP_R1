package com.timp.test.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParanetrosGerais.RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN4LixeiraExcluirdefinitivamente extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO regrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO = new RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO();
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

		boolean sucesso = regrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO.lexeira();
		assertTrue(sucesso, Criar);
		sleep(3000);
		boolean sucesso1 = regrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO.excluirDefinitivo();
		assertTrue(sucesso1, Criar);

	}
	

}
