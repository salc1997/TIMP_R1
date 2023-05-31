package com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãDeTipoTaxaDeAtualizaçãoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãDeTipoTaxaDeAtualizaçãoCriar extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	ConfiguraçãDeTipoTaxaDeAtualizaçãoCriarPO configuraçãDeTipoTaxaDeAtualizaçãoCriarPO;

	public ConfiguraçãDeTipoTaxaDeAtualizaçãoCriar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		configuraçãDeTipoTaxaDeAtualizaçãoCriarPO = new ConfiguraçãDeTipoTaxaDeAtualizaçãoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = configuraçãDeTipoTaxaDeAtualizaçãoCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
