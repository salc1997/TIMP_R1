package com.timp.test.TFP.Configurações.Bloqueios.Periodo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.Periodo.ConfiguracaoBloqueiosEditarPO;

public class ConfiguracaoBloqueiosEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	ConfiguracaoBloqueiosEditarPO configuracaoBloqueiosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		configuracaoBloqueiosEditarPO = new ConfiguracaoBloqueiosEditarPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void TFPEntrar() {
		acessarTFPPO .acessarTFP();
	}

	@Test(priority = 2)
	public void editar() {
		boolean sucesso = configuracaoBloqueiosEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
