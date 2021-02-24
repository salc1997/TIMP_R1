package com.timp.test.CALENDAR;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNegócio.CriarProcessocomTarefaAutomatizadaPO;
import com.sap.timp.pageObjectModel.Calendar.TarefasMultiplasEstagiosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TarefasMultiplasEstagios extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	TarefasMultiplasEstagiosPO  tarefasMultiplasEstagiosPO;

	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
	  tarefasMultiplasEstagiosPO = new  TarefasMultiplasEstagiosPO();
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
 	
 	@Test(priority = 2)
	public void criar() {
 		tarefasMultiplasEstagiosPO.criarProceso();
//		ArrayList<Boolean> sucesso = tarefasMultiplasEstagiosPO.criarProceso();
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Filtros);
//		}
		
	}

}
