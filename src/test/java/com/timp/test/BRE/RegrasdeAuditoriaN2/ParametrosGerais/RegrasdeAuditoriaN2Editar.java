package com.timp.test.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasdeAuditoriaN2EditarPO;

public class RegrasdeAuditoriaN2Editar extends TestBase {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN2EditarPO regrasdeAuditoriaN2EditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN2EditarPO = new RegrasdeAuditoriaN2EditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = regrasdeAuditoriaN2EditarPO.editar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
			
		}
		sleep(1000);
	}
}
