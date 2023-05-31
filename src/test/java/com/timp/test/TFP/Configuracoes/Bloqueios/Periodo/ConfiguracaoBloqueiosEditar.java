package com.timp.test.TFP.Configuracoes.Bloqueios.Periodo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Bloqueios.Periodo.ConfiguracaoBloqueiosEditarPO;

public class ConfiguracaoBloqueiosEditar extends TestBase {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracaoBloqueiosEditarPO configuracaoBloqueiosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuracaoBloqueiosEditarPO = new ConfiguracaoBloqueiosEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = configuracaoBloqueiosEditarPO.editar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
		
		sleep(3000);
	}
}
