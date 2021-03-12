package com.timp.test.TCC.BancoDeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel.ConfiguraçãodeLayoutdePainelCriarcomCópiaExcluirPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel.ConfiguraçãodeLayoutdePainelEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeLayoutdePainelCriarcomCópiaExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãodeLayoutdePainelCriarcomCópiaExcluirPO configuraçãodeLayoutdePainelCriarcomCópiaExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãodeLayoutdePainelCriarcomCópiaExcluirPO = new ConfiguraçãodeLayoutdePainelCriarcomCópiaExcluirPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarTAA() {
		acessarTCCPO.acessarTCC();
	}

	@Test(priority = 2)
	public void criarComCopiaExcluir() {
		boolean sucesso = configuraçãodeLayoutdePainelCriarcomCópiaExcluirPO.criar();
		assertTrue(sucesso, Criar);

		boolean sucesso2 = configuraçãodeLayoutdePainelCriarcomCópiaExcluirPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
