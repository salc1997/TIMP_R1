package com.timp.test.MDR.TabelaApoioECD.DeXParaContraPartida;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.DeXParaContraPartida.DeXParaContraPartidaExcluirEmMassaPO;

public class DeXParaContraPartidaExcluirEmMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeXParaContraPartidaExcluirEmMassaPO deXParaContraPartidaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deXParaContraPartidaExcluirEmMassaPO = new DeXParaContraPartidaExcluirEmMassaPO();
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
	public void criar() {
		boolean sucesso = deXParaContraPartidaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void excluirMassa() {
		boolean sucesso = deXParaContraPartidaExcluirEmMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
