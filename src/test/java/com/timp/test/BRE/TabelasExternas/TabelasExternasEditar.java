package com.timp.test.BRE.TabelasExternas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.TabelasExternas.TabelasExternasEditarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TabelasExternasEditar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	TabelasExternasEditarPO tabelasExternasEditarPO;

  @BeforeClass
  public void beforeClass() {
	driver = initializationM();
	loginTC = new LoginTC();
	acessarBREPO = new AcessarBREPO();
	tabelasExternasEditarPO  = new TabelasExternasEditarPO();
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
	public void Editar() {
		tabelasExternasEditarPO.Editar();
	}
}
