
package com.timp.test.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoVisualizarPO;

public class ConfiguracaoDeTipoTributoVisualizar extends TestBase{	
	LoginTC loginTC;
	AcessarADMPO acessarADMPO; 
	ConfiguracaoDeTipoTributoVisualizarPO configuracaoDeTipoTributoVisualizarPO ;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTipoTributoVisualizarPO = new ConfiguracaoDeTipoTributoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}

	@Test()
	public void Visualizar() {
		loginTC.login();
		acessarADMPO.acessarADM();

		ArrayList<Boolean> sucesso = configuracaoDeTipoTributoVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}		
		sleep(2000);

	}		
}

