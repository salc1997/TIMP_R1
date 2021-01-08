package com.timp.test.ATR.CopiaEstruturas.CopiaMapeamentoDeEstruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasExcluirPO;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;

public class MapeamentoDeEstruturasExcluir extends TestBaseEliel {
 
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeEstruturasExcluirPO mapeamentoDeEstruturasExcluirPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeEstruturasExcluirPO = new  MapeamentoDeEstruturasExcluirPO();
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
	 	public void excluir() {
	 		
	 		boolean sucesso = mapeamentoDeEstruturasExcluirPO.excluir();
			assertTrue(sucesso, Eliminado);
		
	 		
	 	}
}
