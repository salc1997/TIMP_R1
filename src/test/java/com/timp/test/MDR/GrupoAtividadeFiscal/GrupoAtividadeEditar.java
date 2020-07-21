package com.timp.test.MDR.GrupoAtividadeFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadeFiscal.AtividadeEditarPO;
import com.sap.timp.pageObjectModel.MDR.GrupoAtividadeFiscal.GrupoAtividadeEditarPO;

public class GrupoAtividadeEditar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	GrupoAtividadeEditarPO grupoAtividadeEditarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		grupoAtividadeEditarPO = new GrupoAtividadeEditarPO();
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
		  
		 grupoAtividadeEditarPO.editar();
	  }
}
