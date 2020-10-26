package com.timp.test.MDR.AtividadesFiscais.GrupoAtividadeFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal.GrupoAtividadeExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class GrupoAtividadeExcluir extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	GrupoAtividadeExcluirPO grupoAtividadeExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		grupoAtividadeExcluirPO = new GrupoAtividadeExcluirPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		accesarMDR.acessarMDR();

	}

	@Test(priority = 2)
	public void excluir() {
		boolean sucesso = grupoAtividadeExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
