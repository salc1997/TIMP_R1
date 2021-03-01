package com.timp.test.BRE.RegrasDeEscrituração.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarMasCaminhoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasDeEscrituraçãoCriarMasCaminho extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscrituraçãoCriarMasCaminhoPO regrasDeEscrituraçãoCriarMasCaminhoPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscrituraçãoCriarMasCaminhoPO = new RegrasDeEscrituraçãoCriarMasCaminhoPO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void acessarBRE() {
		acessarBREPO.acessarBRE();
	}
	
	@Test(priority = 2)
	public void criar() {
		boolean sucesso = regrasDeEscrituraçãoCriarMasCaminhoPO.criar();
		assertTrue(sucesso, Eliminado);
	}
}
