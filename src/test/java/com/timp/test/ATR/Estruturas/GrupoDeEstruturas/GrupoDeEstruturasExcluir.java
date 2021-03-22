package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasExcluirPO;

public class GrupoDeEstruturasExcluir extends TestBaseEliel{
 
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasExcluirPO grupoDeEstruturasExcluirPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initializationE();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  grupoDeEstruturasExcluirPO = new  GrupoDeEstruturasExcluirPO();
	}


	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	  



	@Test()
	public void criar() {

		loginTC.login();

		acessarATRPO.acessarATR();

		boolean sucesso = grupoDeEstruturasExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);


	}

}
