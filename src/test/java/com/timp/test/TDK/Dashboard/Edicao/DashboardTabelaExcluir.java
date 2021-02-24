package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardTabelaExcluirPO;

public class DashboardTabelaExcluir extends TestBaseEliel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardTabelaExcluirPO dashboardTabelaExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardTabelaExcluirPO = new DashboardTabelaExcluirPO();
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

		boolean sucesso = dashboardTabelaExcluirPO.TabelaExcluir();
		assertTrue(sucesso, Eliminado);

	}

}
