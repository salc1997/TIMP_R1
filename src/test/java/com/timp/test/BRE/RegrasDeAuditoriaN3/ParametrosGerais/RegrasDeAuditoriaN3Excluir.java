package com.timp.test.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais.RegraDeAuditoriaN3ExcluirPO;

public class RegrasDeAuditoriaN3Excluir extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegraDeAuditoriaN3ExcluirPO regraDeAuditoriaN3ExcluirPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regraDeAuditoriaN3ExcluirPO = new RegraDeAuditoriaN3ExcluirPO();
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
		ArrayList<Boolean> sucesso = regraDeAuditoriaN3ExcluirPO.excluir();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
		
	}
 
	
}
