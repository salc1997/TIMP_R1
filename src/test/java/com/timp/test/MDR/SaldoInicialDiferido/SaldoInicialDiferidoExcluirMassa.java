package com.timp.test.MDR.SaldoInicialDiferido;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido.SaldoInicialDiferidoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExlusionMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SaldoInicialDiferidoExcluirMassa extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialDiferidoExcluirMassaPO saldoInicialDiferidoExcluirMassaPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoInicialDiferidoExcluirMassaPO = new SaldoInicialDiferidoExcluirMassaPO();
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

		boolean sucesso = saldoInicialDiferidoExcluirMassaPO.criar();

		assertTrue(sucesso, Criar);

	}

}