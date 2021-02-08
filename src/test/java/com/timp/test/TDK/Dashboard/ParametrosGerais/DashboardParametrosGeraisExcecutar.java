package com.timp.test.TDK.Dashboard.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.ParametrosGerais.DashboardParametrosGeraisExcecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DashboardParametrosGeraisExcecutar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardParametrosGeraisExcecutarPO dashboardParametrosGeraisExcecutarPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardParametrosGeraisExcecutarPO = new DashboardParametrosGeraisExcecutarPO();
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
	public void Executar() {
		
		
		ArrayList<Boolean> sucesso = dashboardParametrosGeraisExcecutarPO.Executar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),"Cartão não foi adicionado");
		}
		
		
	}

}
