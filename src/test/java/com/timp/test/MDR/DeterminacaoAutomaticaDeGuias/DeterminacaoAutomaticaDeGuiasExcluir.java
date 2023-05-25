package com.timp.test.MDR.DeterminacaoAutomaticaDeGuias;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias.DeterminacaoAutomaticaDeGuiasExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DeterminacaoAutomaticaDeGuiasExcluir extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoAutomaticaDeGuiasExcluirPO determinacaoAutomaticaDeGuiasExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoAutomaticaDeGuiasExcluirPO = new DeterminacaoAutomaticaDeGuiasExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = determinacaoAutomaticaDeGuiasExcluirPO.Excluir();
		assertTrue(sucesso, Criar);
	}

}
