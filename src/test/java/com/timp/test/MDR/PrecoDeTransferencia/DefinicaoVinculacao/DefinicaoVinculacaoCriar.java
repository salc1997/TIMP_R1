package com.timp.test.MDR.PrecoDeTransferencia.DefinicaoVinculacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.DefinicaoVinculacao.DefinicaoVinculacaoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DefinicaoVinculacaoCriar extends TestBaseKathy{
  LoginTC loginTC;
  AcessarMDRPO acessarMDRPO;
  DefinicaoVinculacaoCriarPO definicaoVinculacaoCriarPO;
  
  
  @BeforeClass
  public void beforeClass() {

		driver = initializationK();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		definicaoVinculacaoCriarPO = new DefinicaoVinculacaoCriarPO();
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
		boolean sucesso =definicaoVinculacaoCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}