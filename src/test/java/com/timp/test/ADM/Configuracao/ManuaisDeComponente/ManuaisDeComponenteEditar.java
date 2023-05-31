package com.timp.test.ADM.Configuracao.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ManuaisDeComponente.ManuaisDeComponenteEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ManuaisDeComponenteEditar extends TestBase {
	LoginTC loginTC; 
	AcessarADMPO acessarADMPO;
	ManuaisDeComponenteEditarPO manuaisDeComponenteEditarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  manuaisDeComponenteEditarPO = new ManuaisDeComponenteEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test()
	public void editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = manuaisDeComponenteEditarPO.editar();

		assertTrue(sucesso, Editar);
		sleep(2000);
		
	}
 
}
