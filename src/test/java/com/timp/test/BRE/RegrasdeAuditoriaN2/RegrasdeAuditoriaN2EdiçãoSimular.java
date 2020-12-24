package com.timp.test.BRE.RegrasdeAuditoriaN2;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasdeAuditoriaN2Edi��oSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasdeAuditoriaN2Edi��oTabelasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN2Edi��oSimular extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN2Edi��oSimularPO regrasdeAuditoriaN2Edi��oSimularPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN2Edi��oSimularPO = new RegrasdeAuditoriaN2Edi��oSimularPO();
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

		boolean sucesso = regrasdeAuditoriaN2Edi��oSimularPO.editar();
		assertTrue(sucesso, Editar);

	}


}
