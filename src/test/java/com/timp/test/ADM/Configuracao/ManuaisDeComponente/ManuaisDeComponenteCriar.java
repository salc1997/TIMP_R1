
package com.timp.test.ADM.Configuracao.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.ManuaisDeComponente.ManuaisDeComponenteCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ManuaisDeComponenteCriar extends TestBase {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ManuaisDeComponenteCriarPO manuaisDeComponenteCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  manuaisDeComponenteCriarPO = new ManuaisDeComponenteCriarPO();
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
	  
  }
  

	
	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = manuaisDeComponenteCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}
}

