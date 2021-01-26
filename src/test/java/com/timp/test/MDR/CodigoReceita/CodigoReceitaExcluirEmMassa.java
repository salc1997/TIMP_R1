package com.timp.test.MDR.CodigoReceita;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CodigoReceita.CodigoReceitaExcluirEmMassaPO;

public class CodigoReceitaExcluirEmMassa extends TestBaseEliel{

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoReceitaExcluirEmMassaPO codigoReceitaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoReceitaExcluirEmMassaPO = new CodigoReceitaExcluirEmMassaPO();
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
	public void criar() {

		boolean sucesso = codigoReceitaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {


		boolean sucesso2 = codigoReceitaExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
