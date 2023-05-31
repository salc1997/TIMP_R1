
package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoExcluirPO;

public class ConfiguracaoDeTipoTributoExcluir extends TestBase { 
	LoginTC loginTC;
	AcessarADMPO acessarADMPO; 
	ConfiguracaoDeTipoTributoExcluirPO configuracaoDeTipoTributoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTipoTributoExcluirPO = new ConfiguracaoDeTipoTributoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoDeTipoTributoExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);

	}
}

