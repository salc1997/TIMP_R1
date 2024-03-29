package com.timp.test.MDR.ICMSSTTransporte;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.ICMSSTTransporte.ICMSSTTransporteFiltroIDPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaFiltroIDPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosFiltroPorIDPO;

public class ICMSSTTransporteFiltroID extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LimiteCompetenciaFiltroIDPO limiteCompetenciaFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		limiteCompetenciaFiltroIDPO = new LimiteCompetenciaFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = limiteCompetenciaFiltroIDPO.filtro();
		assertTrue(sucesso, Filtros);

	}

}
