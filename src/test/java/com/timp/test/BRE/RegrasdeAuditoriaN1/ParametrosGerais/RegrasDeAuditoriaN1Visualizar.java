package com.timp.test.BRE.RegrasdeAuditoriaN1.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.ParametrosGerais.RegrasDeAuditoriaN1VisualizarPO;

public class RegrasDeAuditoriaN1Visualizar extends TestBase{
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN1VisualizarPO regrasDeAuditoriaN1VisualizarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN1VisualizarPO = new RegrasDeAuditoriaN1VisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void visualizar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN1VisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		
		sleep(2000);
		
	}
 
}
