package com.timp.test.TDK.Execucoes;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesIdPublicoePrivadoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ExecucoesIdPublicoePrivado extends TestBase {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	ExecucoesIdPublicoePrivadoPO execucoesIdPublicoePrivadoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		execucoesIdPublicoePrivadoPO = new ExecucoesIdPublicoePrivadoPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = execucoesIdPublicoePrivadoPO.criar();
		assertTrue(sucesso, Criar);
	}

}
