package com.timp.test.BRE.RegrasdeAuditoriaN1.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.RegrasdeAuditoriaN1Edi��oSimulaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.ParametrosGerais.RegrasdeAuditoriaN1Par�metrosgeraisSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN1Par�metrosgeraisSimular extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN1Par�metrosgeraisSimularPO regrasdeAuditoriaN1Par�metrosgeraisSimularPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN1Par�metrosgeraisSimularPO = new RegrasdeAuditoriaN1Par�metrosgeraisSimularPO();
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
	public void editar() {

		boolean sucesso = regrasdeAuditoriaN1Par�metrosgeraisSimularPO.editar();
		assertTrue(sucesso, Editar);

	}


}
