package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10VisualizarPO;

public class TabelaDeDetalhamentosParaRegistro10Visualizar extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeDetalhamentosParaRegistro10VisualizarPO tabelaDeDetalhamentosParaRegistro10VisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeDetalhamentosParaRegistro10VisualizarPO = new TabelaDeDetalhamentosParaRegistro10VisualizarPO();
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
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void visualizar() {

		ArrayList<Boolean> sucesso = tabelaDeDetalhamentosParaRegistro10VisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualizaçar);

		}
	}

}
