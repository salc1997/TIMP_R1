package com.timp.test.BPMA.ProcessodeNegocio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNeg�cio.ProcessodeNegocioCriarCopiaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ProcessodeNegocioCriarCopia extends TestBase{

	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	 ProcessodeNegocioCriarCopiaPO  processodeNeg�cioCriarCopiaPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
	  processodeNeg�cioCriarCopiaPO = new  ProcessodeNegocioCriarCopiaPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
 	public void login() {
 		loginTC.login();

 	}

 	@Test(priority = 1)
 	public void BPMAEntrar() {
 		 acessarBPMA.acessarBPMA();
 		
 	}
 	
 	@Test(priority = 1)
 	public void CriarCopia() {
 		processodeNeg�cioCriarCopiaPO .criar();
 	//	boolean sucesso = processodeNeg�cioCriarCopiaPO .criar();
		//  assertTrue(sucesso, Criar); 
 		
 	}

}
