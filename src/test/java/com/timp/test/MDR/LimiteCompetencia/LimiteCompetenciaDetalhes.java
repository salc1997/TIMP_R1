package com.timp.test.MDR.LimiteCompetencia;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroCriarPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaCriarPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaDetalhesPO;

public class LimiteCompetenciaDetalhes extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LimiteCompetenciaDetalhesPO limiteCompetenciaDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		limiteCompetenciaDetalhesPO = new LimiteCompetenciaDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void detalhes() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = limiteCompetenciaDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}

	}
}
