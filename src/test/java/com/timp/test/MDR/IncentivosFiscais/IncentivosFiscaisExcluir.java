package com.timp.test.MDR.IncentivosFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.IncentivosFiscais.IncentivosFiscaisExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class IncentivosFiscaisExcluir extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	IncentivosFiscaisExcluirPO incentivosFiscaisExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		incentivosFiscaisExcluirPO = new IncentivosFiscaisExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Excluir() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		boolean sucesso = incentivosFiscaisExcluirPO.Excluir();
		assertTrue(sucesso, Editar);

	}

}
