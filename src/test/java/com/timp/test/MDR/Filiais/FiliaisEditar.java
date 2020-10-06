package com.timp.test.MDR.Filiais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Empresas.EmpresasEditarPO;
import com.sap.timp.pageObjectModel.MDR.Filiais.FiliaisEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FiliaisEditar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FiliaisEditarPO filiaisEditarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		filiaisEditarPO = new FiliaisEditarPO();
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
	public void editar() {

		boolean sucesso = filiaisEditarPO.editar();
		
		assertTrue(sucesso, Editar);
		
	}
	
	
	
	
	

}
