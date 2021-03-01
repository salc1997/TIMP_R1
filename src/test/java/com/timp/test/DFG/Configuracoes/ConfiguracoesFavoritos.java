package com.timp.test.DFG.Configuracoes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesFavoritosPO;

public class ConfiguracoesFavoritos extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesFavoritosPO configuracoesFavoritosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesFavoritosPO = new ConfiguracoesFavoritosPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void favoritos() {
		boolean sucesso = configuracoesFavoritosPO.favoritos();
		assertTrue(sucesso, Criar);
	}
}
