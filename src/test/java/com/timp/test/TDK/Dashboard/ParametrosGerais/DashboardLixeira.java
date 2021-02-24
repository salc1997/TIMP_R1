package com.timp.test.TDK.Dashboard.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.ParametrosGerais.DashboardLixeiraPO;

public class DashboardLixeira extends TestBaseEliel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardLixeiraPO dashboardLixeiraPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardLixeiraPO = new DashboardLixeiraPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
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
	public void lixeira() {
		boolean sucesso = dashboardLixeiraPO.lixeira();
		assertTrue(sucesso, Eliminado);

	}

}
