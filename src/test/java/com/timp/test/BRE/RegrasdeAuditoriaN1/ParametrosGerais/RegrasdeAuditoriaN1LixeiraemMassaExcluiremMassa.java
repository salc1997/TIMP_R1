package com.timp.test.BRE.RegrasdeAuditoriaN1.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.ParametrosGerais.RegrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasDeAuditoriaN2CriarCaminhosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN1LixeiraemMassaExcluiremMassa extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO regrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO = new RegrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO();
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
	public void criar() {

		boolean sucesso = regrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO.excluirMassa();

		assertTrue(sucesso, Criar);

	}

}