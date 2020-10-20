package com.timp.test.MDR.Ajustes.CodigosAjustes;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes.CodigoAjustesVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes.CodigosAjustesCriarPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoCriarPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;

public class CodigosAjustesVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoAjustesVisualizarPO codigoAjustesVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoAjustesVisualizarPO = new CodigoAjustesVisualizarPO();
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

		ArrayList<Boolean> sucesso = codigoAjustesVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}

}
