package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.Executados.Registro1200;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.Registro1200.Executados1200VisualizarPO;
public class Executados1200Visualizar extends TestBaseEliel {
  
	

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Executados1200VisualizarPO executados1200VisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		executados1200VisualizarPO = new Executados1200VisualizarPO();
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
	public void acessarTCC() {
		acessarTCCPO.acessarTCC();
	}

	@Test(priority = 2)
	public void visualizar() {
		ArrayList<Boolean> sucesso = executados1200VisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		
	}
}