package com.timp.test.MDR.Tributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Tributos.TributosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class TributosDetalhes extends TestBaseKathy{
	LoginTC loginTC;
  	AcessarMDRPO acessarMDRPO;
  	TributosDetalhesPO tributosDetalhesPO;
	
  	@BeforeClass
  	public void beforeClass() {
		driver = initializationK();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
	  	tributosDetalhesPO = new TributosDetalhesPO();
  	}

  	@AfterClass
  	public void afterClass() {
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
	public void tributoDetalhes() {
		
		 String sucesso = tributosDetalhesPO.tributoDetalhes();
		 assertEquals(sucesso, "detail", EmpresaVisualizar);
	}
}
