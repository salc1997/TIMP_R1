package com.timp.test.MDR.ThinCapitalization.Emprestimos;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ThinCapitalization.Emprestimos.EmprestimosExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EmprestimosExcluirEmMassa extends TestBase {
 
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	EmprestimosExcluirEmMassaPO emprestimosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		emprestimosExcluirEmMassaPO = new EmprestimosExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 2)
	public void criar() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = emprestimosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = emprestimosExcluirEmMassaPO.emprestimosExcluirEmMassa();
		assertTrue(sucesso2, Eliminado);

	}

}
