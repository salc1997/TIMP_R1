package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal.DeParaLivroApuraçaoXSpedFiscalEditarPO;

public class DeParaLivroApuraçaoXSpedFiscalEditar extends TestBaseEliel {
 
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApuraçaoXSpedFiscalEditarPO deParaLivroApuraçaoXSpedFiscalEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApuraçaoXSpedFiscalEditarPO = new DeParaLivroApuraçaoXSpedFiscalEditarPO();
	}
	
	@AfterClass
	public void afterClass() {
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
		
		
		boolean sucesso = deParaLivroApuraçaoXSpedFiscalEditarPO.editar();
		
		assertTrue(sucesso, Editar);
	}
	
	
	
}
