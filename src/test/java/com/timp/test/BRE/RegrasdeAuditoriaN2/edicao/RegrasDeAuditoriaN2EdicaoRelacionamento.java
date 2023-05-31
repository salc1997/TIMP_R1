package com.timp.test.BRE.RegrasdeAuditoriaN2.edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasDeAuditoriaN2EdicaoRelacionamentoPO;

public class RegrasDeAuditoriaN2EdicaoRelacionamento extends TestBase {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN2EdicaoRelacionamentoPO regrasDeAuditoriaN2EdicaoRelacionamentoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN2EdicaoRelacionamentoPO = new RegrasDeAuditoriaN2EdicaoRelacionamentoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = regrasDeAuditoriaN2EdicaoRelacionamentoPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);
	}
}
