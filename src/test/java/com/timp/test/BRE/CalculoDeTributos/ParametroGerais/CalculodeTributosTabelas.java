package com.timp.test.BRE.CalculoDeTributos.ParametroGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.ParametrosGerais.CalculodeTributosTabelasPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CalculodeTributosTabelas extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	CalculodeTributosTabelasPO calculodeTributosTabelasPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		calculodeTributosTabelasPO = new CalculodeTributosTabelasPO();
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

		boolean sucesso = calculodeTributosTabelasPO.editar();
		assertTrue(sucesso, Editar);


	}

}
