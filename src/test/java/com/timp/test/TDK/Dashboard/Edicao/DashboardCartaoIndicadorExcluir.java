package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardCartaoIndicadorExcluirPO;

public class DashboardCartaoIndicadorExcluir extends TestBaseEliel{
  
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardCartaoIndicadorExcluirPO dashboardCartaoIndicadorExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	    driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardCartaoIndicadorExcluirPO = new DashboardCartaoIndicadorExcluirPO();
		
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
	public void cartaoindicadroexcluir() {
		
		boolean sucesso = dashboardCartaoIndicadorExcluirPO.cartaoindicadorexcluir();

		assertTrue(sucesso, "O Cart�o  n�o foi excluido");
		
	}
	
}