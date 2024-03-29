package com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeExcluirMassaPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtividadeExcluirMassa extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeExcluirMassaPO atividadeExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeExcluirMassaPO = new AtividadeExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = atividadeExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = atividadeExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
		
		sleep(2000);
	}
}
