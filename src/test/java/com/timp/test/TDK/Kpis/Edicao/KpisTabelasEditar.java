package com.timp.test.TDK.Kpis.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisTabelasEditarPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisTabelasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisTabelasEditar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisTabelasEditarPO kpisTabelasEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisTabelasEditarPO = new KpisTabelasEditarPO();

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
	public void Editar() {

		boolean sucesso = kpisTabelasEditarPO.tabelas();

		assertTrue(sucesso, "Tabela não criada");

	}
}
