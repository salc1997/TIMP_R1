package com.timp.test.MDR.CEP.Logradouro;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Logradouro.LogradouroEditarPO;

public class LogradouroEditar extends TestBaseKathy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LogradouroEditarPO logradouroEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationK();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		logradouroEditarPO = new LogradouroEditarPO();
	}

	@AfterClass
	public void afterClass() {
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
	public void editar() {
		boolean sucesso = logradouroEditarPO.logradouroEditar();
		assertTrue(sucesso, Editar);
	}
}
