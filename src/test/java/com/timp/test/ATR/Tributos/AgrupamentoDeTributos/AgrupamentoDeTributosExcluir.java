package com.timp.test.ATR.Tributos.AgrupamentoDeTributos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosExcluirPO;

public class AgrupamentoDeTributosExcluir extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	AgrupamentoDeTributosExcluirPO agrupamentoDeTributosExcluirPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  agrupamentoDeTributosExcluirPO = new  AgrupamentoDeTributosExcluirPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	 	
	 	@Test()
	 	public void excluir() {
	 		
	 		loginTC.login();
	 		acessarATRPO.acessarATR();
	 		
	 		
	 		boolean sucesso = agrupamentoDeTributosExcluirPO.excluir();
			assertTrue(sucesso, Eliminado);
		
	 		
	 	}
	
}
