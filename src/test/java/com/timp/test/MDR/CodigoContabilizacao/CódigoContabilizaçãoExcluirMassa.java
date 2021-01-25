package com.timp.test.MDR.CodigoContabilizacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao.CódigoContabilizaçãoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CódigoContabilizaçãoExcluirMassa  extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CódigoContabilizaçãoExcluirMassaPO códigoContabilizaçãoExcluirMassaPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		códigoContabilizaçãoExcluirMassaPO = new CódigoContabilizaçãoExcluirMassaPO();
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

		boolean sucesso = códigoContabilizaçãoExcluirMassaPO.criar();

		assertTrue(sucesso, Criar);


	}
	
	@Test(dependsOnMethods = "criar")
	public void exlcuir() {

		
		boolean sucesso = códigoContabilizaçãoExcluirMassaPO.excluir();

		assertTrue(sucesso, Eliminado);

	}


}
