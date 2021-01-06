package com.timp.test.MDR.SCANC.MovimentoSCANC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC.MovimentoSCANCExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MovimentoSCANCExcluirMasas extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MovimentoSCANCExcluirMasasPO  movimentoSCANCExcluirMasasPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		 movimentoSCANCExcluirMasasPO = new MovimentoSCANCExcluirMasasPO();
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
 		
 		boolean sucesso = movimentoSCANCExcluirMasasPO.criar();
 		assertTrue(sucesso, Criar);
 		
 		boolean sucesso2 = movimentoSCANCExcluirMasasPO.ExcluirMasas();
 		assertTrue(sucesso2, Eliminado);
 	}

}
