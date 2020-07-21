package com.timp.test.MDR.Bairro;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;
import com.sap.timp.pageObjectModel.MDR.Bairro.BairroFiltrosPO;

public class BairroFiltros extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	BairroFiltrosPO bairroFiltrosPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		bairroFiltrosPO = new BairroFiltrosPO();
	}
	
	@AfterClass
	public void afterClass(){
		driver.close();
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
	  public void filtro() {
		  
		  boolean sucesso = bairroFiltrosPO.filtro();
		  
		  assertTrue(sucesso,Filtros);
	  }
	
}
