package com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExlusionMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class NotasDeclararAnexoIIIExcluirMassa extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	NotasDeclararAnexoIIIExcluirMassaPO notasDeclararAnexoIIIExcluirMassaPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		notasDeclararAnexoIIIExcluirMassaPO = new NotasDeclararAnexoIIIExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  
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

		boolean sucesso = notasDeclararAnexoIIIExcluirMassaPO.criar();

		assertTrue(sucesso, Criar);

	}
}
