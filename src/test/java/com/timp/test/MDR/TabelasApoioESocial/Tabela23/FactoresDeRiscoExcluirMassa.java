package com.timp.test.MDR.TabelasApoioESocial.Tabela23;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela23.FatoresDeRiscoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FactoresDeRiscoExcluirMassa extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FatoresDeRiscoExcluirMassaPO factoresDeRiscoExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		factoresDeRiscoExcluirMassaPO = new FatoresDeRiscoExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {


		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = factoresDeRiscoExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);

		boolean sucesso2 = factoresDeRiscoExcluirMassaPO.exluirMassa();
		assertTrue(sucesso2, Eliminado);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = factoresDeRiscoExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}


}
