package com.timp.test.BPMA.ProcessodeNegocio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNeg�cio.CriarProcessocomTarefaAutomatizadaPO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNeg�cio.CriarProcessocomTarefaManualPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CriarProcessocomTarefaAutomatizada extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	CriarProcessocomTarefaAutomatizadaPO  criarProcessocomTarefaAutomatizadaPO;

	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationC();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
	  criarProcessocomTarefaAutomatizadaPO = new  CriarProcessocomTarefaAutomatizadaPO();
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
 	public void criar() {
 		
 		ArrayList<Boolean> sucesso = criarProcessocomTarefaAutomatizadaPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
 		
 	}

}