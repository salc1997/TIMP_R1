package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoFavoritosPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoRaizPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoRaiz extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguracaoConfiguracaoRaizPO parametrosGeraisConfiguraçãoConfiguraçãoRaizPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfiguraçãoConfiguraçãoRaizPO = new ParametrosGeraisConfiguracaoConfiguracaoRaizPO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criarConfiguracao() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		boolean sucesso = parametrosGeraisConfiguraçãoConfiguraçãoRaizPO.raizConfiguracao();
		assertTrue(sucesso, "O registro existe na raiz");
		
		sleep(3000);
	
	}

}
