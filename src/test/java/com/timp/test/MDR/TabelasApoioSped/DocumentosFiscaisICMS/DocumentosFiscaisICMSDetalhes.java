package com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSDetalhesPO;

public class DocumentosFiscaisICMSDetalhes extends TestBaseEliel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DocumentosFiscaisICMSDetalhesPO documentosFiscaisICMSDetalhesPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		documentosFiscaisICMSDetalhesPO = new DocumentosFiscaisICMSDetalhesPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
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
	public void Visualizar() {

		ArrayList<Boolean> sucesso = documentosFiscaisICMSDetalhesPO.detalhes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			
			assertTrue(sucesso.get(i), Detalhes);
			
		}
	}	
}
