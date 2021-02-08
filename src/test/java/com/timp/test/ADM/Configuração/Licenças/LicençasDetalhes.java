package com.timp.test.ADM.Configura��o.Licen�as;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Licen�as.Licen�asDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Licen�asDetalhes extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Licen�asDetalhesPO licen�asDetalhesPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  licen�asDetalhesPO = new Licen�asDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void AcessarADM() {

		acessarADMPO.acessarADM();
		
	}
	
	@Test(priority = 2)
	public void Detalles() {

		
		ArrayList<Boolean> sucesso = licen�asDetalhesPO.detalles();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		
	}

}
