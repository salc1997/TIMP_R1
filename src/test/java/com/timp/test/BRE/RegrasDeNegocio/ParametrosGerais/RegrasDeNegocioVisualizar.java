package com.timp.test.BRE.RegrasDeNegocio.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais.RegrasDeNegocioVisualizarPO;

public class RegrasDeNegocioVisualizar extends TestBase {


	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeNegocioVisualizarPO regrasDeNegocioVisualizarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeNegocioVisualizarPO = new RegrasDeNegocioVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	
	@Test()
	public void visualizar() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeNegocioVisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	
}
