package com.timp.test.TDK.Dashboard.Raiz;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Raiz.RaizFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RaizFiltroId extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	RaizFiltroIdPO raizFiltroIdPO;
	
  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		raizFiltroIdPO = new RaizFiltroIdPO();
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
		
		ArrayList<Boolean> sucesso = raizFiltroIdPO.FiltroID();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),Filtros);
		}
		
	}
}
