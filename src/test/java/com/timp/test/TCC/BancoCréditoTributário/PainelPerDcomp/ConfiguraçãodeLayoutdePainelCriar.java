package com.timp.test.TCC.BancoCr�ditoTribut�rio.PainelPerDcomp;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Atribui��esdeRegras.RegradeAbasCriarPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainelCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��odeLayoutdePainelCriar extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarTCCPO  acessarTCCPO;
	Configura��odeLayoutdePainelCriarPO configura��odeLayoutdePainelCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeLayoutdePainelCriarPO = new Configura��odeLayoutdePainelCriarPO();
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
		boolean sucesso = configura��odeLayoutdePainelCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
