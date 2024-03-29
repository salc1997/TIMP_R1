package com.timp.test.BRE.RegrasdeAuditoriaN1.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.Edicao.RegrasdeAuditoriaN1EdiçãoEstruturasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN1EdiçãoEstruturas extends TestBase{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN1EdiçãoEstruturasPO regrasdeAuditoriaN1EdiçãoEstruturasPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN1EdiçãoEstruturasPO = new RegrasdeAuditoriaN1EdiçãoEstruturasPO();
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }


	@Test()
	public void editar() {

		loginTC.login();
		acessarBREPO.acessarBRE();


		boolean sucesso = regrasdeAuditoriaN1EdiçãoEstruturasPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);
		sleep(1000);

	}

}
