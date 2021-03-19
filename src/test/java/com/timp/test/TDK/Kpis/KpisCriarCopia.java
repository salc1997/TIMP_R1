package com.timp.test.TDK.Kpis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisCriarCopiaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class KpisCriarCopia extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisCriarCopiaPO kpisCriarCopiaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisCriarCopiaPO = new KpisCriarCopiaPO();
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
	public void acessarTDK() {
		acessarTDKPO.acessarTDK();
	}

	@Test(priority = 2)
	public void criarCopia() {

		ArrayList<Boolean> sucesso = kpisCriarCopiaPO.Criar();
		;

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}

		boolean sucesso1 = kpisCriarCopiaPO.Excluir();

		assertTrue(sucesso1, Criar);

		ArrayList<Boolean> sucesso2 = kpisCriarCopiaPO.comparar();

		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), Detalhes);
		}

	}
}
