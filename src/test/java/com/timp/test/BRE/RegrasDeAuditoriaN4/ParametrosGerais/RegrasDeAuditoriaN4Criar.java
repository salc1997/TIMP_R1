package com.timp.test.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParanetrosGerais.RegrasDeAuditoriaN4CriarPO;

public class RegrasDeAuditoriaN4Criar extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN4CriarPO regrasDeAuditoriaN4CriarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN4CriarPO = new RegrasDeAuditoriaN4CriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
		boolean sucesso = regrasDeAuditoriaN4CriarPO.criar();
		assertTrue(sucesso, Criar);
	}
 
}
