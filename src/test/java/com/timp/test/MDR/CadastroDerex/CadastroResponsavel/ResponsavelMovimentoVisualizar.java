package com.timp.test.MDR.CadastroDerex.CadastroResponsavel;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel.*;

public class ResponsavelMovimentoVisualizar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ResponsavelMovimentoVisualizarPO responsavelMovimentoVisualizarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		responsavelMovimentoVisualizarPO = new ResponsavelMovimentoVisualizarPO();
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
		 
		 String sucesso = responsavelMovimentoVisualizarPO.visualizar();
		  
		 assertEquals(sucesso, "edit", EmpresaVisualizar);
	  }
}
