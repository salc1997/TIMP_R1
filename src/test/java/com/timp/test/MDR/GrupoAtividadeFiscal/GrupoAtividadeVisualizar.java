package com.timp.test.MDR.GrupoAtividadeFiscal;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadeFiscal.AtividadeVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.GrupoAtividadeFiscal.GrupoAtividadeVisualizarPO;

public class GrupoAtividadeVisualizar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	GrupoAtividadeVisualizarPO grupoAtividadeVisualizarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		grupoAtividadeVisualizarPO = new GrupoAtividadeVisualizarPO();
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
		  
		 String sucesso = grupoAtividadeVisualizarPO.visualizar();
		 
		 assertEquals(sucesso, "edit", visualizaçar);
		 
	  }
}
