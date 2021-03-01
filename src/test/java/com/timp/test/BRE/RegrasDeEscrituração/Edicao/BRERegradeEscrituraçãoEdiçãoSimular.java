package com.timp.test.BRE.RegrasDeEscritura��o.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.Edicao.BRERegradeEscritura��oEdi��oSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2Edi��oSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class BRERegradeEscritura��oEdi��oSimular extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	BRERegradeEscritura��oEdi��oSimularPO bRERegradeEscritura��oEdi��oSimularPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		bRERegradeEscritura��oEdi��oSimularPO = new BRERegradeEscritura��oEdi��oSimularPO();
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

		boolean sucesso = bRERegradeEscritura��oEdi��oSimularPO.editar();
		assertTrue(sucesso, Editar);

	}

}
