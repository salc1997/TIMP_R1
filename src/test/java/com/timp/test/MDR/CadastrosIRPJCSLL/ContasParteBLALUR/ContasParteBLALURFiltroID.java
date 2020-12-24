package com.timp.test.MDR.CadastrosIRPJCSLL.ContasParteBLALUR;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.ContasParteBLALUR.ContasParteBLALURFiltroIDPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido.SaldoInicialDiferidoFiltroIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContasParteBLALURFiltroID extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasParteBLALURFiltroIDPO contasParteBLALURFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasParteBLALURFiltroIDPO = new ContasParteBLALURFiltroIDPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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

		boolean sucesso = contasParteBLALURFiltroIDPO.filtro();
		assertTrue(sucesso, semAcesso);

	}

}
