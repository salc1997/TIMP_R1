package com.timp.test.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParanetrosGerais.RegrasDeAuditoriaN4EditarPO;

public class RegrasDeAuditoriaN4Editar extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN4EditarPO regrasDeAuditoriaN4EditarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN4EditarPO = new RegrasDeAuditoriaN4EditarPO();
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
		
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN4EditarPO.editar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
		
		
	}
	
}