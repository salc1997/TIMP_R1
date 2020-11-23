package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaComplementarParaDIRFExcluirMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaComplementarParaDIRFExcluirMassaPO tabelaComplementarParaDIRFExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaComplementarParaDIRFExcluirMassaPO = new TabelaComplementarParaDIRFExcluirMassaPO();
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
		boolean sucesso = tabelaComplementarParaDIRFExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void excluirMassa() {
		boolean sucesso = tabelaComplementarParaDIRFExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
