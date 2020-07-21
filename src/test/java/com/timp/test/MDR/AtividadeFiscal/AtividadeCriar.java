package com.timp.test.MDR.AtividadeFiscal;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;
import com.sap.timp.pageObjectModel.MDR.AtividadeFiscal.AtividadeCriarPO;

public class AtividadeCriar extends TestBase{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeCriarPO atividadeCriarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeCriarPO = new AtividadeCriarPO();
	}
	/*
	@AfterClass
	public void afterClass(){
		driver.close();
	}
	*/
	
	@Test(priority = 0)
	public void login() {
		loginTC.login();
		
	}
	
	@Test(priority = 1)
	public void acessarMDR() {
		
		acessarMDRPO.acessarMDR();
		
	}
  
	
	 @Test(priority = 2)
	  public void visualizar() {
		  
		  boolean sucesso = atividadeCriarPO.criar();
		  
		  assertTrue(sucesso, Criar);
	  }
	
	
	
}
