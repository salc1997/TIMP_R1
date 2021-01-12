package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaExcluirPO;

public class MapeamentoDeParametrosDeEntradaExcluir extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaExcluirPO mapeamentoDeParametrosDeEntradaExcluirPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaExcluirPO = new  MapeamentoDeParametrosDeEntradaExcluirPO();
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
	 		
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaExcluirPO.excluir();
			assertTrue(sucesso, Eliminado);
		
	 		
	 	}
	
 
}
