package com.timp.test.TDK.Execucoes.Raiz;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.Raiz.RaizFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RaizFiltroId extends TestBase {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	RaizFiltroIdPO raizFiltroIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		raizFiltroIdPO = new RaizFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = raizFiltroIdPO.FiltroID();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}
	}
}
