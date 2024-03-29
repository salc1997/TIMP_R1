package com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira.*;

public class InstituicaoEditar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InstitucaoEditarPO institucaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		institucaoEditarPO = new InstitucaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = institucaoEditarPO.editar();
		assertTrue(sucesso, Editar);
		sleep(4000);
	}

}
