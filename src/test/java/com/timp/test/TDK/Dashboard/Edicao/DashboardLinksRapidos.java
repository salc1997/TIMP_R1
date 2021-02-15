package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardLinksRapidosPO;

public class DashboardLinksRapidos extends TestBaseEliel{
  
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardLinksRapidosPO dashboardLinksRapidosPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardLinksRapidosPO = new DashboardLinksRapidosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
	public void linksrapidos() {
		ArrayList<Boolean> sucesso = dashboardLinksRapidosPO.linksrapidos();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i),"N�o foi poss�vel adicionar o link r�pido");
		}
		
		
	}
	
}
