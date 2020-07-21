package com.timp.test.MDR.DEREXInstituicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DerexInstituicao.InstitucaoCriarPO;
import com.sap.timp.pageObjectModel.MDR.DerexInstituicao.InstitucaoEditarPO;

public class InstituicaoEditar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InstitucaoEditarPO institucaoEditarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		institucaoEditarPO = new InstitucaoEditarPO();
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
	  public void editar() {
		  
		 boolean sucesso = institucaoEditarPO.editar();
		 assertTrue(sucesso,Editar);
	  }
	
}
