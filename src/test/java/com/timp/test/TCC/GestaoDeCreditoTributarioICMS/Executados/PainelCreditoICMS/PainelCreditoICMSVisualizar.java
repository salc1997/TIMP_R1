package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.Executados.PainelCreditoICMS;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.PainelCreditoICMS.PainelCreditoICMSVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PainelCreditoICMSVisualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelCreditoICMSVisualizarPO painelCreditoICMSVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelCreditoICMSVisualizarPO = new PainelCreditoICMSVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
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

		
		ArrayList<Boolean> sucesso = painelCreditoICMSVisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}

}