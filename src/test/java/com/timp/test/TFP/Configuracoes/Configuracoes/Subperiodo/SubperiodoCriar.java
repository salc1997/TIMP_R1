package com.timp.test.TFP.Configuracoes.Configuracoes.Subperiodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Configuracoes.Subperíodo.SubperiodoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SubperiodoCriar extends TestBase {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubperiodoCriarPO subperíodoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subperíodoCriarPO = new SubperiodoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		boolean sucesso = subperíodoCriarPO.criar();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Criar);

	}

}
