package com.timp.test.MDR.TabelasApoioESocial.Tabela09;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela09.TiposDeArquivosESocialExcluirEmMassaPO;

public class TiposDeArquivosESocialExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeArquivosESocialExcluirEmMassaPO tiposDeArquivosESocialExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeArquivosESocialExcluirEmMassaPO = new TiposDeArquivosESocialExcluirEmMassaPO();
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
	public void criar() {

		boolean sucesso = tiposDeArquivosESocialExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = tiposDeArquivosESocialExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}