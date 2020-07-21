package com.timp.test.MDR.Municipio;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Bairro.BairroEditarPO;
import com.sap.timp.pageObjectModel.MDR.Municipio.MunicipioFiltroPO;

public class MunicipioFiltros extends TestBase{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MunicipioFiltroPO municipioFiltroPO;
	
	
	@BeforeClass
	public void beforeClass() {
		

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		municipioFiltroPO = new MunicipioFiltroPO();
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
		  
		 boolean sucesso =  municipioFiltroPO.filtro();
		 
		 assertTrue(sucesso, Editar);
	  }
}
