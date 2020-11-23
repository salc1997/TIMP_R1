package com.timp.test.MDR.AtividadesFiscais.AtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal.AtividadeExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtividadeExcluirMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeExcluirMassaPO atividadeExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeExcluirMassaPO = new AtividadeExcluirMassaPO();
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
		boolean sucesso = atividadeExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void excluirMassa() {
		boolean sucesso = atividadeExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
