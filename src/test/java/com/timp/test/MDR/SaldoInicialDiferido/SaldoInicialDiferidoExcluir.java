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
import com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido.SaldoInicialDiferidoExcluirPO;

public class SaldoInicialDiferidoExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialDiferidoExcluirPO saldoInicialDiferidoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoInicialDiferidoExcluirPO = new SaldoInicialDiferidoExcluirPO();
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
	public void excluir() {

		boolean sucesso = saldoInicialDiferidoExcluirPO.excluir();
		assertTrue(sucesso, semAcesso);

	}

}
