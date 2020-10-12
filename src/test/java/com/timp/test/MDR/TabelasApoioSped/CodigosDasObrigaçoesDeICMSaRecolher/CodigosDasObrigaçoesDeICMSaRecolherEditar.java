package com.timp.test.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigosDasObriga�oesDeICMSaRecolher.CodigosDasObriga�oesDeICMSaRecolherEditarPO;

public class CodigosDasObriga�oesDeICMSaRecolherEditar extends TestBaseEliel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigosDasObriga�oesDeICMSaRecolherEditarPO codigosDasObriga�oesDeICMSaRecolherEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigosDasObriga�oesDeICMSaRecolherEditarPO = new CodigosDasObriga�oesDeICMSaRecolherEditarPO();
	}
 
	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void editar() {

		boolean sucesso = codigosDasObriga�oesDeICMSaRecolherEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
