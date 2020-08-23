package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal.DeParaLivroApuraçaoXSpedFiscalDetalhesPO;


public class DeParaLivroApuraçaoXSpedFiscalDetalhes extends TestBaseEliel {

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApuraçaoXSpedFiscalDetalhesPO deParaLivroApuraçaoXSpedFiscalDetalhesPO;
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApuraçaoXSpedFiscalDetalhesPO = new DeParaLivroApuraçaoXSpedFiscalDetalhesPO();
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

		ArrayList<Boolean> sucesso = deParaLivroApuraçaoXSpedFiscalDetalhesPO.detalhes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			
			assertTrue(sucesso.get(i), Detalhes);
			
		}
	}	
		
	
	
}
