package com.timp.test.TDK.Dashboard.DashboardPublicos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.DashboardPublicos.DashboardDetalhesPO;

public class DashboardDetalhes extends TestBaseFernando{
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardDetalhesPO dashboardDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardDetalhesPO = new DashboardDetalhesPO();
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
	public void filtro() {		
		ArrayList<Boolean> sucesso = dashboardDetalhesPO.detalhes();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
