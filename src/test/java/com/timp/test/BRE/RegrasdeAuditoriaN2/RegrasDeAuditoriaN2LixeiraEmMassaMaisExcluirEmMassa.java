package com.timp.test.BRE.RegrasdeAuditoriaN2;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO;

public class RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassa extends TestBaseEliel{
 
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO regrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO = new RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO();
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
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO.criar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
}
