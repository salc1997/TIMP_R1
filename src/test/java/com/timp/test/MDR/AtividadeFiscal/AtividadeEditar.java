package com.timp.test.MDR.AtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadeFiscal.AtividadeCriarPO;
import com.sap.timp.pageObjectModel.MDR.AtividadeFiscal.AtividadeEditarPO;

public class AtividadeEditar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeEditarPO atividadeEditarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeEditarPO = new AtividadeEditarPO();
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
		  
		 boolean sucesso =  atividadeEditarPO.editar();
		 
		 assertTrue(sucesso, Editar);
	  }
	
}
