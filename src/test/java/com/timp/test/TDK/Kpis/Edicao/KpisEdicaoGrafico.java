package com.timp.test.TDK.Kpis.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisEdicaoGraficoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisEdicaoGrafico extends TestBaseMassiel{
 
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisEdicaoGraficoPO kpisEdicaoGraficoPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisEdicaoGraficoPO = new KpisEdicaoGraficoPO();
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
 	public void Grafico() {
 		kpisEdicaoGraficoPO.Grafico();
 		
 	/*	boolean sucesso = kpisCriarP.Criar();

 		assertTrue(sucesso, Criar);*/
 		
 	}

}
