package com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoVisualizarPO;

public class UtilizacaoDosCreditosNaApuracaoVisualizar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UtilizacaoDosCreditosNaApuracaoVisualizarPO utilizacaoDosCreditosNaApuracaoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		utilizacaoDosCreditosNaApuracaoVisualizarPO = new UtilizacaoDosCreditosNaApuracaoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void visualizar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = utilizacaoDosCreditosNaApuracaoVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualizar);

		}
	}

}
