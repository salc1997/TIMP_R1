package com.timp.test.MDR.ContratoIOF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ContratoIOF.ContratoIOFEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContratoIOFEditar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContratoIOFEditarPO contratoIOFEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contratoIOFEditarPO = new ContratoIOFEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = contratoIOFEditarPO.editar();

		assertTrue(sucesso, Criar);

	}

}
