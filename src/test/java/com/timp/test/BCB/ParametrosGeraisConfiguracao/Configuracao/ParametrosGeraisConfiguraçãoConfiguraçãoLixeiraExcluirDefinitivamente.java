package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoLixeiraExcluirDefinitivamentePO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoRaizPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamente extends TestBase {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguracaoConfiguracaoLixeiraExcluirDefinitivamentePO parametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO = new ParametrosGeraisConfiguracaoConfiguracaoLixeiraExcluirDefinitivamentePO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test(priority = 2)
	public void criarConfiguracao() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		boolean sucesso = parametrosGeraisConfiguraçãoConfiguraçãoLixeiraExcluirDefinitivamentePO.lixeiraExcluirDefinitivamenteConfiguracao();
		assertTrue(sucesso, Eliminado);
		
		sleep(3000);
	}

}
