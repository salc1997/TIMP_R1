package com.timp.test.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class StatusOcorrenciaFiscalExcluirEmMassa extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	StatusOcorrenciaFiscalExcluirEmMassaPO statusOcorrenciaFiscalExcluirEmMassaPO;
	
     @BeforeClass
	  public void beforeClass() {
	
			driver = initialization();
			loginTC = new LoginTC();
			acessarMDRPO = new AcessarMDRPO();
			statusOcorrenciaFiscalExcluirEmMassaPO = new StatusOcorrenciaFiscalExcluirEmMassaPO();
	  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }


	@Test()
	public void criar() {

		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = statusOcorrenciaFiscalExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		boolean sucesso2 = statusOcorrenciaFiscalExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
