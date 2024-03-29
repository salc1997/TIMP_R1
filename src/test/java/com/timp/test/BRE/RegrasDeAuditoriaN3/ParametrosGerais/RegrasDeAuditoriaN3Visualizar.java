package com.timp.test.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais.RegrasDeAuditoriaN3VisualizarPO;

public class RegrasDeAuditoriaN3Visualizar extends TestBase{
 
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN3VisualizarPO regrasDeAuditoriaN3VisualizarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN3VisualizarPO = new RegrasDeAuditoriaN3VisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test()
	public void visualizar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeAuditoriaN3VisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	
}
