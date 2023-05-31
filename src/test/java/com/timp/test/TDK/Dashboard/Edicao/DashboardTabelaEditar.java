package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardTabelaEditarPO;

public class DashboardTabelaEditar extends TestBase {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardTabelaEditarPO dashboardTabelaEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardTabelaEditarPO = new DashboardTabelaEditarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void linksrapidos() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = dashboardTabelaEditarPO.TabelaEditar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
	}
}
