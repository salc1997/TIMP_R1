package com.timp.test.TDK.Dashboard.MeusDashboards.MeusFavoritos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.MeusDashboards.MeusFavoritos.DashboardMeusFavoritosFiltroPorIDPO;

public class DashboardMeusFavoritosFiltroPorID extends TestBase {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardMeusFavoritosFiltroPorIDPO dashboardMeusFavoritosFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardMeusFavoritosFiltroPorIDPO = new DashboardMeusFavoritosFiltroPorIDPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void filtro() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = dashboardMeusFavoritosFiltroPorIDPO.filtro();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
}
