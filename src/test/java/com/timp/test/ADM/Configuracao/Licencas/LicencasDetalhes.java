package com.timp.test.ADM.Configuracao.Licencas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuracao.Licencas.LicencasDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LicencasDetalhes extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	LicencasDetalhesPO licen�asDetalhesPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  licen�asDetalhesPO = new LicencasDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
	  
  }

	
	@Test
	public void Detalles() {
		loginTC.login();
		acessarADMPO.acessarADM();
		ArrayList<Boolean> sucesso = licen�asDetalhesPO.detalles();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		sleep(2000);
	}

}
