package com.timp.test.TDK.Dashboard;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.DashboardEdiçãoGráficoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardEdiçãoGráfico extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardEdiçãoGráficoPO dashboardEdiçãoGráficoPO;
	
  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardEdiçãoGráficoPO = new DashboardEdiçãoGráficoPO();
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
	public void editar() {
	
		boolean sucesso = dashboardEdiçãoGráficoPO.Editar();
		assertTrue(sucesso,Criar);
	}
}
