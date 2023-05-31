package com.timp.test.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContasDefaultParaExtemporaneoExcluirMassa extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasDefaultParaExtemporaneoExcluirMassaPO contasDefaultParaExtemporaneoExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasDefaultParaExtemporaneoExcluirMassaPO = new ContasDefaultParaExtemporaneoExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = contasDefaultParaExtemporaneoExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = contasDefaultParaExtemporaneoExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
