package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo.ConfiguracaoDeTributoGrupoCriarPO;

public class ConfiguracaoDeTributoGrupoCriar extends TestBase{  
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributoGrupoCriarPO configuracaoDeTributoGrupoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTributoGrupoCriarPO = new ConfiguracaoDeTributoGrupoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();

		boolean sucesso = configuracaoDeTributoGrupoCriarPO.criar();
		assertTrue(sucesso, Criar);		
		
		sleep(2000);

	}
}
