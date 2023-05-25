package com.timp.test.MDR.DeterminacaoAutomaticaDeGuias;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheCriarPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias.DeterminacaoAutomaticaDeGuiasCriarPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias.DeterminacaoAutomaticaDeGuiasEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DeterminacaoAutomaticaDeGuiasEditar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoAutomaticaDeGuiasEditarPO determinacaoAutomaticaDeGuiasEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoAutomaticaDeGuiasEditarPO = new DeterminacaoAutomaticaDeGuiasEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = determinacaoAutomaticaDeGuiasEditarPO.Editar();
		assertTrue(sucesso, Criar);
	}

}
