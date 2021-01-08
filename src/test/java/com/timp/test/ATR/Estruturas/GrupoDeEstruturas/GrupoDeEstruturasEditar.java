package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasEditarPO;

public class GrupoDeEstruturasEditar extends TestBaseEliel {

	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasEditarPO grupoDeEstruturasEditarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  grupoDeEstruturasEditarPO = new  GrupoDeEstruturasEditarPO();
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
	 	public void editar() {
	 		
	 		ArrayList<Boolean> sucesso = grupoDeEstruturasEditarPO.editar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Editar);
				
			}
			
		
	 		
	 	}
}
