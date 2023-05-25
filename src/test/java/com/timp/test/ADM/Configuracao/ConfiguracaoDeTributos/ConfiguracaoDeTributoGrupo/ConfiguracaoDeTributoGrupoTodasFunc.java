package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo.ConfiguracaoDeTributoGrupoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo.ConfiguracaoDeTributoGrupoTodasFuncPO;

public class ConfiguracaoDeTributoGrupoTodasFunc extends TestBaseSteven{  
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributoGrupoTodasFuncPO configuracaoDeTributoGrupoTodasFuncPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTributoGrupoTodasFuncPO = new ConfiguracaoDeTributoGrupoTodasFuncPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}

	@Test(priority = 0)
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();

		boolean sucesso = configuracaoDeTributoGrupoTodasFuncPO.criar();
		assertTrue(sucesso, Criar);		
		
		sleep(2000);

	}
	
	@Test(priority = 1)
	public void editar() {
	
		
		boolean sucesso = configuracaoDeTributoGrupoTodasFuncPO.editar();
		assertTrue(sucesso, Editar);
		
		sleep(2000);

	}
}
