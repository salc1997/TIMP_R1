package com.timp.test.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal.ObservaçoesdoDocumentoFiscalEditarPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ObservaçoesdoDocumentoFiscalEditar extends TestBaseEliel {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ObservaçoesdoDocumentoFiscalEditarPO observaçoesdoDocumentoFiscalEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		observaçoesdoDocumentoFiscalEditarPO= new ObservaçoesdoDocumentoFiscalEditarPO();
	}
	/*
	@AfterClass
	public void afterClass() {
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

		observaçoesdoDocumentoFiscalEditarPO.editar();
		//boolean sucesso = antecipacaoEditarPO.editar();
		
		//assertTrue(sucesso, Editar);

	}
	
	
	

}
