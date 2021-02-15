package com.timp.test.MDR.TabelasApoioESocial.Tabela03;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela03.NaturezaDasRubricasExcluirPO;

public class NaturezaDasRubricasExcluir extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	NaturezaDasRubricasExcluirPO naturezaDasRubricasExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		naturezaDasRubricasExcluirPO = new NaturezaDasRubricasExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	/*
	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}
	*/
	@Test()
	public void excluir() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		

		boolean sucesso = naturezaDasRubricasExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}
	
}
