package com.timp.test.MDR.IncentivosFiscais;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.IncentivosFiscais.IncentivosFiscaisExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class IncentivosFiscaisExcluirEmMassa extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	IncentivosFiscaisExcluirEmMassaPO incentivosFiscaisExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		incentivosFiscaisExcluirEmMassaPO = new IncentivosFiscaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		accesarMDR.acessarMDR();

		boolean sucesso = incentivosFiscaisExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {

		boolean sucesso2 = incentivosFiscaisExcluirEmMassaPO.incentivosFiscaisExcluirEmMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
