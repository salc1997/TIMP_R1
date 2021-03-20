package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaEdPO;

public class MapeamentoDeParametrosDeEntradaEditar extends TestBaseEliel {

	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaEdPO mapeamentoDeParametrosDeEntradaeditarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaeditarPO = new  MapeamentoDeParametrosDeEntradaEdPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	 	@Test()
	 	public void editar() {
	 		
	 		loginTC.login();
			 acessarATRPO.acessarATR();
			 
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaeditarPO.Editar();
			assertTrue(sucesso, Editar);
		
	 		
	 	}
	
}
