package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoFavoritosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfigura��oConfigura��oFavoritos extends TestBase {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguracaoConfiguracaoFavoritosPO parametrosGeraisConfigura��oConfigura��oFavoritosPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfigura��oConfigura��oFavoritosPO = new ParametrosGeraisConfiguracaoConfiguracaoFavoritosPO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void criarConfiguracao() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		boolean sucesso = parametrosGeraisConfigura��oConfigura��oFavoritosPO.favoritosConfiguracao();
		assertTrue(sucesso, Criar);
		
		sleep(3000);
	}

}
