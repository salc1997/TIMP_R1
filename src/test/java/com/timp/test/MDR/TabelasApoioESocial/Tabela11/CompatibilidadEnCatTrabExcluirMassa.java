package com.timp.test.MDR.TabelasApoioESocial.Tabela11;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela11.CompatibilidadEnCatTrabExcluirMassaPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CompatibilidadEnCatTrabExcluirMassa extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CompatibilidadEnCatTrabExcluirMassaPO compatibilidadEnCatTrabExcluirMassaPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		compatibilidadEnCatTrabExcluirMassaPO = new CompatibilidadEnCatTrabExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}
	@Test(priority = 2)
	public void criar() {

		boolean sucesso = compatibilidadEnCatTrabExcluirMassaPO.criar();

		assertTrue(sucesso, Criar);

	}

}
