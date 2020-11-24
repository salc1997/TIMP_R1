package com.timp.test.MDR.CadastrosIRPJCSLL.ContasContábeisRBLP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.ContasContábeisRBLP.ContasContábeisRBLPFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContasContábeisRBLPFiltroId extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ContasContábeisRBLPFiltroIdPO  contasContábeisRBLPFiltroIdPO;

  @BeforeClass
  public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		contasContábeisRBLPFiltroIdPO  = new ContasContábeisRBLPFiltroIdPO();
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
 	public void filtro() {

 		contasContábeisRBLPFiltroIdPO.filtro();
 		//boolean sucesso = contasContábeisRBLPFiltroIdPO.filtro();

 		//assertTrue(sucesso, Filtros);


 	}


}
