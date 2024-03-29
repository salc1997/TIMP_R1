package com.timp.test.MDR.IncentivosFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.IncentivosFiscais.IncentivosFiscaisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class IncentivosFiscaisCriar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	IncentivosFiscaisCriarPO incentivosFiscaisCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		incentivosFiscaisCriarPO = new IncentivosFiscaisCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void CriarIncentivosFiscais() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = incentivosFiscaisCriarPO.CriarIncentivosFiscais();
		assertTrue(sucesso, Criar);

	}

}
