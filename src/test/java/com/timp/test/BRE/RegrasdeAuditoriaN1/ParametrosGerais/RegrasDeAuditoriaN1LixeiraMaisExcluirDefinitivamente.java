package com.timp.test.BRE.RegrasdeAuditoriaN1.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.ParametrosGerais.RegrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO;

public class RegrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamente extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO regrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO = new RegrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO();
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
	public void excluir() {
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN1LixeiraMaisExcluirDefinitivamentePO.excluir();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "O registro n�o foi excluido");
		}
		
	}
}