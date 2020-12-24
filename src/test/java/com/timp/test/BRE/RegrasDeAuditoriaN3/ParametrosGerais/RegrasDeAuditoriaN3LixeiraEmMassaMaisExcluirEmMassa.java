package com.timp.test.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais.RegrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO;

public class RegrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassa extends TestBaseEliel {
 
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO regrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO = new RegrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO();
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
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN3LixeiraEmMassaMaisExcluirEmMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
}
