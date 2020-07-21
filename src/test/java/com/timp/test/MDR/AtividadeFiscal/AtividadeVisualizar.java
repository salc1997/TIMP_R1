package com.timp.test.MDR.AtividadeFiscal;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadeFiscal.AtividadeVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.Bairro.BairroVisualizarPO;

public class AtividadeVisualizar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeVisualizarPO atividadeVisualizarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeVisualizarPO = new AtividadeVisualizarPO();
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
	  public void filtro() {
		  
		 String sucesso = atividadeVisualizarPO.visualizar();
		 
		 assertEquals(sucesso, "edit", visualizaçar);
		 
	  }
}
