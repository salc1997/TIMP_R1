package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaCriarPO;

public class MapeamentoDeParametrosDeEntradaCriar extends TestBaseEliel{
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaCriarPO mapeamentoDeParametrosDeEntradaCriarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaCriarPO = new  MapeamentoDeParametrosDeEntradaCriarPO();
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
	 	public void criar() {
	 		
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaCriarPO.criar();
			assertTrue(sucesso, Criar);
		
	 		
	 	}
	
 
}
