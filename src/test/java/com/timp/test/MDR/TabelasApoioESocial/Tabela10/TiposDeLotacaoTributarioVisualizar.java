package com.timp.test.MDR.TabelasApoioESocial.Tabela10;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributariaVisualizarPO;

import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;
import java.util.ArrayList;
import org.testng.annotations.AfterClass;

public class TiposDeLotacaoTributarioVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeLotacaoTributariaVisualizarPO tiposDeLotacaoTributariaVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeLotacaoTributariaVisualizarPO = new TiposDeLotacaoTributariaVisualizarPO();
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

		ArrayList<Boolean> sucesso = tiposDeLotacaoTributariaVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}

}
