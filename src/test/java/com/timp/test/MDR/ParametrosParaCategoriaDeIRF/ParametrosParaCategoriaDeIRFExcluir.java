package com.timp.test.MDR.ParametrosParaCategoriaDeIRF;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosExcluirPO;

import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFDetalhesPO;

import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObriga�oesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;

public class ParametrosParaCategoriaDeIRFExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaCategoriaDeIRFExcluirPO parametrosParaCategoriaDeIRFExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaCategoriaDeIRFExcluirPO = new ParametrosParaCategoriaDeIRFExcluirPO();

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
	public void excluir() {

		boolean sucesso = parametrosParaCategoriaDeIRFExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}