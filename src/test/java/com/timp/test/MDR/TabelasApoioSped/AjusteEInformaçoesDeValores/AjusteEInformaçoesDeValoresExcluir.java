package com.timp.test.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores.AjusteEInforma�oesDeValoresExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

<<<<<<< HEAD
public class AjusteEInforma�oesDeValoresExcluir extends TestBaseEliel {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInforma�oesDeValoresExcluirPO ajusteEInforma�oesDeValoresExcluirPO;
=======
public class AjusteEInforma�oesDeValoresExcluir {

  @BeforeClass
  public void beforeClass() {
  }
>>>>>>> branch 'master' of https://github.com/salc1997/TIMP_R1.git

<<<<<<< HEAD
	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInforma�oesDeValoresExcluirPO = new AjusteEInforma�oesDeValoresExcluirPO();
	}
	/*
	 * @AfterClass public void afterClass(){ driver.close(); }
	 */

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		boolean sucesso = ajusteEInforma�oesDeValoresExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		
	}	
=======
  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
  public void login() {
  }
  
  @Test(priority = 1)
  public void acessarMDR() {
  }
  
  
  
  @Test(priority = 2)
  public void excluir() {
  }
  
>>>>>>> branch 'master' of https://github.com/salc1997/TIMP_R1.git

}
