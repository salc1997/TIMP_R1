package com.timp.test.BRE.RegrasdeAuditoriaN2;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasDeAuditoriaN2EdicaoRelacionamentoPO;

public class RegrasDeAuditoriaN2EdicaoRelacionamento extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN2EdicaoRelacionamentoPO regrasDeAuditoriaN2EdicaoRelacionamentoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN2EdicaoRelacionamentoPO = new RegrasDeAuditoriaN2EdicaoRelacionamentoPO();
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
		boolean sucesso = regrasDeAuditoriaN2EdicaoRelacionamentoPO.editar();
		assertTrue(sucesso, Editar);
	}
}