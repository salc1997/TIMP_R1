package com.timp.test.ADM.Configuracao.Licencas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;

import com.sap.timp.pageObjectModel.ADM.Configuracao.Licencas.LicencasTodasFuncPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LicencasTodasFunc extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	LicencasTodasFuncPO licencasTodasFuncPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  licencasTodasFuncPO = new LicencasTodasFuncPO();
  }

  @AfterClass
  public void afterClass() {
  driver.close();
	  
  }

	
	@Test(priority = 0)
	public void Detalles() {
		loginTC.login();
		acessarADMPO.acessarADM();
		ArrayList<Boolean> sucesso = licencasTodasFuncPO.detalles();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
		sleep(2000);
	}
	
	 @Test(priority = 1)
		public void visualizar() {
		
			
			ArrayList<Boolean> sucesso = licencasTodasFuncPO.visualizar();

			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);
			}
			sleep(2000);
		}

}
