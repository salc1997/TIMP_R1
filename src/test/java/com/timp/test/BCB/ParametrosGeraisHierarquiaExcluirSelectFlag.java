package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfigura��oCriarPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquiaExcluirSelectFlagPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisHierarquiaExcluirSelectFlag extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisHierarquiaExcluirSelectFlagPO parametrosGeraisHierarquiaExcluirSelectFlagPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisHierarquiaExcluirSelectFlagPO = new ParametrosGeraisHierarquiaExcluirSelectFlagPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);

	}

	@Test(priority = 2)
	public void excluir() {
		boolean sucesso = parametrosGeraisHierarquiaExcluirSelectFlagPO.excluirSeleccionandoFlag();
		assertTrue(sucesso, Eliminado);
	}

}
