package com.timp.test.BRB.ValidacaoEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.ValidacaoEstruturas.ContasConsolidadasEliminacoesConsolidadasPO;


public class ContasConsolidadasEliminacoesConsolidadas extends TestBase {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	ContasConsolidadasEliminacoesConsolidadasPO contasConsolidadasEliminacoesConsolidadasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		contasConsolidadasEliminacoesConsolidadasPO = new ContasConsolidadasEliminacoesConsolidadasPO();

	}

	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */
	@Test(priority = 0)
	public void login() {

		loginTC.login();

	}

	@Test(priority = 1)
	public void brbEntrar() {
		acessarBrbPO.acessar();

	}

	@Test(priority = 2)
	public void verificar() {

		ArrayList<Boolean> sucesso = contasConsolidadasEliminacoesConsolidadasPO.verificar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Os dados n�o concordam com os establecidos");
		}

	}

}
