package com.timp.test.TDK.Kpis;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisFiltroPorIdPO;

public class KpisFiltroPorId extends TestBaseEliel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisFiltroPorIdPO kpisFiltroPorIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisFiltroPorIdPO = new KpisFiltroPorIdPO();

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
	public void filtro() {

		boolean sucesso = kpisFiltroPorIdPO.filtro();

		assertTrue(sucesso, Filtros);

	}
}
