package com.timp.test.MDR.SaldoInicialDiferido;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido.SaldoInicialDiferidoCriarPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido.SaldoInicialDiferidoEditarPO;

public class SaldoInicialDiferidoEditar extends TestBaseSteven{
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialDiferidoEditarPO saldoInicialDiferidoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoInicialDiferidoEditarPO = new SaldoInicialDiferidoEditarPO();
	}
	
	@AfterClass public void afterClass(){ driver.close(); }
	 

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

		
		boolean sucesso = saldoInicialDiferidoEditarPO.editar();
		assertTrue(sucesso, semAcesso);
		
	}			
	
	
	
	
	
}
