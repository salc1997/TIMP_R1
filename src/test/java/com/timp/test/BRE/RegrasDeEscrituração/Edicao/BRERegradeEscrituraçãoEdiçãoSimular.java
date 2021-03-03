package com.timp.test.BRE.RegrasDeEscrituração.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.Edicao.BRERegradeEscrituraçãoEdiçãoSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2EdiçãoSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class BRERegradeEscrituraçãoEdiçãoSimular extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	BRERegradeEscrituraçãoEdiçãoSimularPO bRERegradeEscrituraçãoEdiçãoSimularPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		bRERegradeEscrituraçãoEdiçãoSimularPO = new BRERegradeEscrituraçãoEdiçãoSimularPO();
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }


	@Test()
	public void simular() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();

		boolean sucesso = bRERegradeEscrituraçãoEdiçãoSimularPO.editar();
		assertTrue(sucesso, Editar);

	}

}
