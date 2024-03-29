package com.timp.test.TFP.Periodos.SubPeriodoPeriodicidade;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Periodo.ConfiguracoesPeríodoFiltroPorIdPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Status.SubPeriodo.SubPeriodoFiltroPorIdPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.Periodos.PeriodoFiltroPorIdPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.SubPeriodoPeriodicidade.SubPeriodoPeriodicidadeFiltroPorIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SubPeriodoPeriodicidadeFiltroPorId extends TestBase {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubPeriodoPeriodicidadeFiltroPorIdPO subPeriodoPeriodicidadeFiltroPorIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subPeriodoPeriodicidadeFiltroPorIdPO = new SubPeriodoPeriodicidadeFiltroPorIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = subPeriodoPeriodicidadeFiltroPorIdPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), filtros);
		}

	}

}
