package com.timp.test.TDK.Kpis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisCriarP;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class KpisCriar extends TestBaseMassiel{
 
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisCriarP kpisCriarP;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisCriarP = new KpisCriarP();
		
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
		
		boolean sucesso = kpisCriarP.Criar();

		assertTrue(sucesso, Criar);
		
	}
 

}
