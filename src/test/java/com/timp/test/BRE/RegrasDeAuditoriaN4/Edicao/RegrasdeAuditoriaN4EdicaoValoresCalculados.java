package com.timp.test.BRE.RegrasDeAuditoriaN4.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.Edicao.RegrasdeAuditoriaN4EdicaoValoresCalculadosPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2ValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN4EdicaoValoresCalculados extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN4EdicaoValoresCalculadosPO regrasdeAuditoriaN4EdicaoValoresCalculadosPO;
	
	@BeforeClass
	public void beforeClass() {
	
			driver = initializationKen();
			loginTC = new LoginTC();
			acessarBREPO = new AcessarBREPO();
			regrasdeAuditoriaN4EdicaoValoresCalculadosPO = new RegrasdeAuditoriaN4EdicaoValoresCalculadosPO();
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
	public void criar() {
		ArrayList<Boolean> sucesso =regrasdeAuditoriaN4EdicaoValoresCalculadosPO.editar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Valor calculado con exito");
		}
	}
}
