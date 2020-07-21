package com.timp.test.MDR.Empresas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Empresas.EmpresasViasualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class EmpresasVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EmpresasViasualizarPO empresasVisualizarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		empresasVisualizarPO = new EmpresasViasualizarPO();
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
  public void visualizar() {
	  
	  String sucesso = empresasVisualizarPO.visualizar();
	  
	  assertEquals(sucesso, "edit",EmpresaVisualizar);
	  
  }
  
  
  
}
