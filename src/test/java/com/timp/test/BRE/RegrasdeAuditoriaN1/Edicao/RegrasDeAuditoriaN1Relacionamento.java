package com.timp.test.BRE.RegrasdeAuditoriaN1.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.Edicao.RegrasDeAuditoriaN1RelacionamentoPO;

public class RegrasDeAuditoriaN1Relacionamento extends TestBaseEliel {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN1RelacionamentoPO regrasDeAuditoriaN1RelacionamentoPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN1RelacionamentoPO = new RegrasDeAuditoriaN1RelacionamentoPO();
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
	public void acessarBRE() {

		acessarBREPO.acessarBRE();

	}
	@Test(priority = 2)
	public void editar() {

		boolean sucesso = regrasDeAuditoriaN1RelacionamentoPO.editar();
		assertTrue(sucesso, "N�o foi adicionado o relacionamento");

	}

	
	
}