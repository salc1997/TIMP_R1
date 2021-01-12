package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaVisualizarPO;

public class MapeamentoDeParametrosDeEntradaVisualizar extends TestBaseEliel {

	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaVisualizarPO mapeamentoDeParametrosDeEntradaVisualizarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaVisualizarPO = new  MapeamentoDeParametrosDeEntradaVisualizarPO();
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  
	  @Test(priority = 0)
	 	public void login() {
	 		loginTC.login();

	 	}

	 	@Test(priority = 1)
	 	public void ATREntrar() {
	 		 acessarATRPO.acessarATR();
	 		
	 	}
	 	
	 	@Test(priority = 1)
	 	public void visualizar() {
	 		
	 		ArrayList<Boolean> sucesso = mapeamentoDeParametrosDeEntradaVisualizarPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizaçar);
				
			}
			
		
	 		
	 	}
	
	
}
