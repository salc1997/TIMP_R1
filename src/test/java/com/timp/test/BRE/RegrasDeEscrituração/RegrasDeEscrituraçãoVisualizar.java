package com.timp.test.BRE.RegrasDeEscritura��o;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.RegrasDeEscritura��oCriarComCopiaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.RegrasDeEscritura��oCriarMasCaminhoPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.RegrasDeEscritura��oEditarPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.RegrasDeEscritura��oVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscritura��oVisualizar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscritura��oVisualizarPO regrasDeEscritura��oVisualizarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscritura��oVisualizarPO = new RegrasDeEscritura��oVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
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
	public void visualizar() {
		
		ArrayList<Boolean> sucesso = regrasDeEscritura��oVisualizarPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
		
		
	}
}
