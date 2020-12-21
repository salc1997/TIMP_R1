package com.timp.test.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParanetrosGerais.RegrasDeAuditoriaN4CriarPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParanetrosGerais.RegrasDeAuditoriaN4EdicaoFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasDeAuditoriaN4EdicaoFiltros extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN4EdicaoFiltrosPO regrasDeAuditoriaN4FiltrosPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN4FiltrosPO = new RegrasDeAuditoriaN4EdicaoFiltrosPO();
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
		//regrasDeAuditoriaN4FiltrosPO.filtros();
		boolean sucesso = regrasDeAuditoriaN4FiltrosPO.filtros();
		assertTrue(sucesso, "disque se mostro");
	}

}
