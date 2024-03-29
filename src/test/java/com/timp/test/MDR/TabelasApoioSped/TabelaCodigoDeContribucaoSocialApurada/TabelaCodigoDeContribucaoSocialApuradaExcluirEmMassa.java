package com.timp.test.MDR.TabelasApoioSped.TabelaCodigoDeContribucaoSocialApurada;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDeContribucaoSocialApurada.TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassa extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassaPO tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassaPO = new TabelaCodigoDeContribucaoSocialApuradaExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {

		boolean sucesso2 = tabelaCodigoDeContribucaoSocialApuradaExcluirEmMassaPO.excluirEmMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
