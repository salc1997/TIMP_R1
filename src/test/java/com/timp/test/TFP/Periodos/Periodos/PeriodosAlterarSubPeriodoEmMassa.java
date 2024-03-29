package com.timp.test.TFP.Periodos.Periodos;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.Periodos.PeriodosAlterarPeriodosEmMassaPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.Periodos.PeriodosAlterarSubPeriodoEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PeriodosAlterarSubPeriodoEmMassa extends TestBase{
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	PeriodosAlterarSubPeriodoEmMassaPO periodosAlterarSubPeriodoEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		periodosAlterarSubPeriodoEmMassaPO = new PeriodosAlterarSubPeriodoEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void alterarPeriodoEmMassa() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		//periodosAlterarPeriodosEmMassaPO.alterarPeriodoEmMassa();		
		ArrayList<Boolean> sucesso = periodosAlterarSubPeriodoEmMassaPO.alterarSubPeriodoEmMassa();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), filtros);
		}

	}
}
