package com.timp.test.MDR.ParametrosOficializacaoLivros;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosFiltroPorIDPO;

public class ParametrosOficializacaoLivrosFiltroPorID extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosOficializacaoLivrosFiltroPorIDPO parametrosOficializacaoLivrosFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosOficializacaoLivrosFiltroPorIDPO = new ParametrosOficializacaoLivrosFiltroPorIDPO();

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
	public void filtro() {

		boolean sucesso = parametrosOficializacaoLivrosFiltroPorIDPO.filtro();
		assertTrue(sucesso, Filtros);

		

	}
  
	
}
