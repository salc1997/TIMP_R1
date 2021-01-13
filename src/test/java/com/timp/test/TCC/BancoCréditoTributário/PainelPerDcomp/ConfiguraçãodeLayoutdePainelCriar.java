package com.timp.test.TCC.BancoCréditoTributário.PainelPerDcomp;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegradeAbasCriarPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainelCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeLayoutdePainelCriar extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarTCCPO  acessarTCCPO;
	ConfiguraçãodeLayoutdePainelCriarPO configuraçãodeLayoutdePainelCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãodeLayoutdePainelCriarPO = new ConfiguraçãodeLayoutdePainelCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarTCC() {
		acessarTCCPO.acessarTCC();
	}

	@Test(priority = 2)
	public void criar() {
		boolean sucesso = configuraçãodeLayoutdePainelCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
