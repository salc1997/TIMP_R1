package com.timp.test.BRE.CalculoDeTributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.C�lculodeTributosEdi��oEstruturasPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasdeAuditoriaN2Edi��oTabelasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class C�lculodeTributosEdi��oEstruturas extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	C�lculodeTributosEdi��oEstruturasPO c�lculodeTributosEdi��oEstruturasPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		c�lculodeTributosEdi��oEstruturasPO = new C�lculodeTributosEdi��oEstruturasPO();
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
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

		boolean sucesso = c�lculodeTributosEdi��oEstruturasPO.editar();
		assertTrue(sucesso, Editar);


	}

}
