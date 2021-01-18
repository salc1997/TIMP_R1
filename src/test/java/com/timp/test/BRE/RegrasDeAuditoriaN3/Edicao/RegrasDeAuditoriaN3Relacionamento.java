package com.timp.test.BRE.RegrasDeAuditoriaN3.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.Edicao.RegrasDeAuditoriaN3RelacionamentoPO;

public class RegrasDeAuditoriaN3Relacionamento extends TestBaseEliel{

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN3RelacionamentoPO regrasDeAuditoriaN3RelacionamentoPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN3RelacionamentoPO = new RegrasDeAuditoriaN3RelacionamentoPO();
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

		boolean sucesso = regrasDeAuditoriaN3RelacionamentoPO.editar();
		assertTrue(sucesso, "Não foi adicionado o relacionamento");

	}

	
	
}
