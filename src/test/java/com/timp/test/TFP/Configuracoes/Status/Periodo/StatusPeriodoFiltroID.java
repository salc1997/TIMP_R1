package com.timp.test.TFP.Configuracoes.Status.Periodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Status.Periodo.StatusPeriodoFiltroIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class StatusPeriodoFiltroID extends TestBase {

	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	StatusPeriodoFiltroIDPO statusPeriodoFiltroIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		statusPeriodoFiltroIDPO = new StatusPeriodoFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

	@Test()
	public void filtro() {
		loginTC.login();
		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = statusPeriodoFiltroIDPO.Filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}

	}

}
