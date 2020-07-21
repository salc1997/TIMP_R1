package com.timp.test.MDR.DetalheTipoTributo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoEliminarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DetalheExcluir extends TestBase{
	  
		LoginTC loginTC;
		AcessarMDRPO acessarMDRPO;
		DetalheExcluirPO detalheExcluirPO;
		
		
		@BeforeClass
		public void beforeClass() {
			
			driver = initialization();
			loginTC = new LoginTC();
			acessarMDRPO = new AcessarMDRPO();
			detalheExcluirPO = new DetalheExcluirPO();
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
		  
		  boolean sucesso=detalheExcluirPO.eliminar();
		  
		  assertTrue(sucesso,Eliminado);
	  }

}
