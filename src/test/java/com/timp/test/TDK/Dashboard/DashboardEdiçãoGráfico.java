package com.timp.test.TDK.Dashboard;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.DashboardEdi��oGr�ficoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardEdi��oGr�fico extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardEdi��oGr�ficoPO dashboardEdi��oGr�ficoPO;
	
  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardEdi��oGr�ficoPO = new DashboardEdi��oGr�ficoPO();
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
	
		boolean sucesso = dashboardEdi��oGr�ficoPO.Editar();
		assertTrue(sucesso,Criar);
	}
}
