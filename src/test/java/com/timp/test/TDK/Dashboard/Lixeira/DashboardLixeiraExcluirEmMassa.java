package com.timp.test.TDK.Dashboard.Lixeira;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Lixeira.DashboardLixeiraExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardLixeiraExcluirEmMassa extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardLixeiraExcluirEmMassaPO dashboardLixeiraExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardLixeiraExcluirEmMassaPO = new DashboardLixeiraExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
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
	public void excluir() {
		boolean sucesso = dashboardLixeiraExcluirEmMassaPO.comparar();

		assertTrue(sucesso, Criar);

		boolean sucesso2 = dashboardLixeiraExcluirEmMassaPO.ExcluirMasas();

		assertTrue(sucesso2, Criar);
	}

}
