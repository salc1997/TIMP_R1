package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardGraficoExcluirPO;

public class DashboardGraficoExcluir extends TestBaseEliel{
  
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardGraficoExcluirPO dashboardGraficoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	    driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardGraficoExcluirPO = new DashboardGraficoExcluirPO();
		
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
	public void grafico() {
		
		boolean sucesso = dashboardGraficoExcluirPO.GraficoExcluir();

		assertTrue(sucesso, "O Grafico  n�o foi excluido");
		
	}
	
}