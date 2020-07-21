package com.timp.test.MDR.Empresas;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Empresas.EmpresasEditarPO;

public class EmpresaEditar extends TestBase{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EmpresasEditarPO empresasEditarPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		empresasEditarPO = new EmpresasEditarPO();
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
		
		boolean sucesso = empresasEditarPO.editar();
		
		assertTrue(sucesso, Editar);
		
	}
	
	
	
}
