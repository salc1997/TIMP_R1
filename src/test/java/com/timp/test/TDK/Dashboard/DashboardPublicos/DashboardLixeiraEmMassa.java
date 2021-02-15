package com.timp.test.TDK.Dashboard.DashboardPublicos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.DashboardPublicos.DashboardLixeiraEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardLixeiraEmMassa extends TestBaseMassiel{
  
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardLixeiraEmMassaPO dashboardLixeiraEmMassaPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardLixeiraEmMassaPO = new DashboardLixeiraEmMassaPO();
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
	public void criar() {
		
		boolean sucesso = dashboardLixeiraEmMassaPO .criar();
		assertTrue(sucesso,Criar);
		
		boolean sucesso2 = dashboardLixeiraEmMassaPO .ExcluirMasas();
		assertTrue(sucesso2,Criar);
		
		boolean sucesso3 = dashboardLixeiraEmMassaPO .comparar();
		assertTrue(sucesso3,Criar);
		
	}

}
