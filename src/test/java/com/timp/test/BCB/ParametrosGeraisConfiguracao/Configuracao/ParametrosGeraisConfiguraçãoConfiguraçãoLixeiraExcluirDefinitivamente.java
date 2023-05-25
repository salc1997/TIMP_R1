package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoLixeiraExcluirDefinitivamentePO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoRaizPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamente extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguracaoConfiguracaoLixeiraExcluirDefinitivamentePO parametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO = new ParametrosGeraisConfiguracaoConfiguracaoLixeiraExcluirDefinitivamentePO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test(priority = 2)
	public void criarConfiguracao() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		boolean sucesso = parametrosGeraisConfigura��oConfigura��oLixeiraExcluirDefinitivamentePO.lixeiraExcluirDefinitivamenteConfiguracao();
		assertTrue(sucesso, Eliminado);
		
		sleep(3000);
	}

}
