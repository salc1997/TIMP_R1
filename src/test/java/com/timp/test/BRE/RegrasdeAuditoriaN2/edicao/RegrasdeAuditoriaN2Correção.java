package com.timp.test.BRE.RegrasdeAuditoriaN2.edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2Corre��oPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2Edi��oTabelasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN2Corre��o extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN2Corre��oPO regrasdeAuditoriaN2Corre��oPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN2Corre��oPO = new RegrasdeAuditoriaN2Corre��oPO();
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

		boolean sucesso = regrasdeAuditoriaN2Corre��oPO.editar();
		assertTrue(sucesso, Editar);

	}

}
