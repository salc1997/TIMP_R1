package com.timp.test.TCC.BancoDeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributárioEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeBancodeCréditoTributárioEditar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãodeBancodeCréditoTributárioEditarPO configuraçãodeBancodeCréditoTributárioEditarPO;

	@Test
	public void f() {
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãodeBancodeCréditoTributárioEditarPO = new ConfiguraçãodeBancodeCréditoTributárioEditarPO();
	}

	@AfterClass
	public void afterClass() {
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
	public void editar() {

		boolean sucesso = configuraçãodeBancodeCréditoTributárioEditarPO.Editar();
		assertTrue(sucesso, Criar);
	}

}
